package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.GouWuModel;
import com.jk.model.ShangpinModel;
import com.jk.model.pingjiaModel;
import com.jk.service.QingChengService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("qingcheng")
@ComponentScan(basePackages = {"com.jk.*"})
public class QingChengController {
    @Reference
    private QingChengService qingchengService;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 查询商品详细信息
     * @param id
     * @return
     */
    @RequestMapping("querygouwu")
    @ResponseBody
    private GouWuModel querygouwu(Integer id){
        GouWuModel gw = qingchengService.querygouwu(id);
        return gw;
    }

    /**
     * 书商品详情页面
     * @return
     */
    @RequestMapping("toitem")
    private String toitem(){
        return "item";
    }

    /**
     * 商品参数介绍
     * @param id
     * @return
     */
    @RequestMapping("queryshangpin")
    @ResponseBody
    private ShangpinModel queryshangpin(Integer id){
        ShangpinModel sp = qingchengService.queryshangpin(id);
        return sp;
    }

    /**
     * 商品评价
     * @param a
     * @return
     */
    @RequestMapping("querypingjia")
    @ResponseBody
    private List<pingjiaModel> querypingjia(String a){
        List<pingjiaModel> list = new ArrayList<pingjiaModel>();
        if("0".equals(a)){
            list = mongoTemplate.findAll(pingjiaModel.class,"t_pingjia");

        }

        if("1".equals(a) | "2".equals(a) | "3".equals(a)){
            Query query = new Query();
            query.addCriteria(Criteria.where("grade").is(a));
            list = mongoTemplate.find(query,pingjiaModel.class,"t_pingjia");
        }

        return list;
    }


    /**
     *好评百分比
     * @param a
     * @return
     */
    @RequestMapping("querycount")
    @ResponseBody
    private pingjiaModel querycount(){
        pingjiaModel pj = new pingjiaModel();
        Query query= new Query();
        pj.setCount(mongoTemplate.count(query, pingjiaModel.class,"t_pingjia"));

        query.addCriteria(Criteria.where("grade").is("3"));
        pj.setHaoping(mongoTemplate.count(query, pingjiaModel.class,"t_pingjia"));

        return pj;
    }

    /**
     * 加入购物车
     * @param id
     * @param count
     * @return
     */
    @RequestMapping("tocart")
    private void tocart(Integer id,Long count){
        GouWuModel gouWu = qingchengService.querygw(id);
        if (redisTemplate.hasKey(gouWu.getId()+""+gouWu.getColor())){
            GouWuModel gw = (GouWuModel) redisTemplate.opsForValue().get(gouWu.getId()+""+gouWu.getColor());
            Long c  = gw.getCount() + count;
            gw.setCount(c);
            redisTemplate.opsForValue().set(gouWu.getId()+""+gouWu.getColor(),gw);
        }else{
            gouWu.setCount(count);
            redisTemplate.opsForValue().set(gouWu.getId()+""+gouWu.getColor(),gouWu);
        }



    }
    /**
     * 去购物车
     * @return
     */
 @RequestMapping("tocarttow")
    private ModelAndView tocarttow(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cart");
        return mv;
    }


    /**
     * 查询购物车
     * @return
     */
    @RequestMapping("querymycar")
    @ResponseBody
    private List<GouWuModel> querymycar(){
        List<GouWuModel> list = qingchengService.querygwt();
        List<GouWuModel> listtow = new ArrayList<GouWuModel>();
        for (int i = 0; i<list.size();i++){
            int id =  list.get(i).getId();
            Integer color = list.get(i).getColor();
            if (redisTemplate.hasKey(id+""+color)){
                GouWuModel gw = (GouWuModel) redisTemplate.opsForValue().get(id+""+color);
                listtow.add(gw);
            }
        }
        return listtow;
    }

    @RequestMapping("delgwc")
    @ResponseBody
    private void delgwc(Integer id){
        GouWuModel gouWu = qingchengService.querygw(id);
        redisTemplate.delete("gouWu.getId()+\"\"+gouWu.getColor()");

    }


}
