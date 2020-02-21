package com.jk.model;

import java.io.Serializable;

public class GouWuModel implements Serializable {
    private static final long serialVersionUID = 12L;
    private Integer id;

    private String productname;

    private String picture;

    private Integer number;

    private Double price;

    private Integer color;

    private String memorycapacity;

    private String versions;

    private String purchase;

    private String suit;

    private Long  count;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getMemorycapacity() {
        return memorycapacity;
    }

    public void setMemorycapacity(String memorycapacity) {
        this.memorycapacity = memorycapacity == null ? null : memorycapacity.trim();
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions == null ? null : versions.trim();
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase == null ? null : purchase.trim();
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit == null ? null : suit.trim();
    }
}