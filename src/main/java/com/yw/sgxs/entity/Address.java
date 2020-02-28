package com.yw.sgxs.entity;

import java.sql.Timestamp;

public class Address {
    private int aid;
    private int uid;
    private String name;
    private String tel;
    private String province;
    private String city;
    private String county;
    private String address;
    private int code;
    private int status;
    private Timestamp createTime;

    public Address() {
    }

    public Address(int aid, int uid, String name, String tel, String province, String city, String county, String address, int code, int status, Timestamp createTime) {
        this.aid = aid;
        this.uid = uid;
        this.name = name;
        this.tel = tel;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.code = code;
        this.status = status;
        this.createTime = createTime;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
