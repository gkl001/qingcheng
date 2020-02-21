package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class DingdanModel implements Serializable {
    private static final long serialVersionUID = 11L;
    private Integer id;

    private String productname;

    private Double price;

    private Integer number;

    private String bianhao;

    private Date time;

    private Integer static1;

    private Integer info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao == null ? null : bianhao.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatic1() {
        return static1;
    }

    public void setStatic1(Integer static1) {
        this.static1 = static1;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }
}