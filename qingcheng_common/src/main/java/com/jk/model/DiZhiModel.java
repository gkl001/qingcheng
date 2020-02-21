package com.jk.model;

import java.io.Serializable;

public class DiZhiModel implements Serializable {
    private static final long serialVersionUID = 10L;
    private Integer id;

    private String name;

    private String site;

    private Integer phone;

    private Integer static2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getStatic2() {
        return static2;
    }

    public void setStatic2(Integer static2) {
        this.static2 = static2;
    }
}