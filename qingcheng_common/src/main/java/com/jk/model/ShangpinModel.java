package com.jk.model;

import java.io.Serializable;

public class ShangpinModel implements Serializable {
    private static final long serialVersionUID = 14L;
    private Integer id;

    private Integer shopid;

    private String distinguishability;

    private String rearcamera;

    private String frontcamera;

    private String nuclearnumber;

    private String frequency;

    private String brand;

    private Integer bianhao;

    private Integer weight;

    private String location;

    private String info;

    private String system;

    private String pixel;

    private String productname;

    private String memorycapacity;

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getMemorycapacity() {
        return memorycapacity;
    }

    public void setMemorycapacity(String memorycapacity) {
        this.memorycapacity = memorycapacity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getDistinguishability() {
        return distinguishability;
    }

    public void setDistinguishability(String distinguishability) {
        this.distinguishability = distinguishability == null ? null : distinguishability.trim();
    }

    public String getRearcamera() {
        return rearcamera;
    }

    public void setRearcamera(String rearcamera) {
        this.rearcamera = rearcamera == null ? null : rearcamera.trim();
    }

    public String getFrontcamera() {
        return frontcamera;
    }

    public void setFrontcamera(String frontcamera) {
        this.frontcamera = frontcamera == null ? null : frontcamera.trim();
    }

    public String getNuclearnumber() {
        return nuclearnumber;
    }

    public void setNuclearnumber(String nuclearnumber) {
        this.nuclearnumber = nuclearnumber == null ? null : nuclearnumber.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getBianhao() {
        return bianhao;
    }

    public void setBianhao(Integer bianhao) {
        this.bianhao = bianhao;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getPixel() {
        return pixel;
    }

    public void setPixel(String pixel) {
        this.pixel = pixel == null ? null : pixel.trim();
    }
}