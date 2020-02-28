package com.yw.sgxs.entity;

import java.sql.Timestamp;

public class Fruit {
    private int fid;
    private int kid;
    private String name;
    private double price;
    private int stock;
    private int sales;
    private String img;
    private String description;
    private int status;
    private Timestamp createTime;

    public Fruit() {
    }

    public Fruit(int fid, int kid, String name, double price, int stock, int sales, String img, String description, int status, Timestamp createTime) {
        this.fid = fid;
        this.kid = kid;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.sales = sales;
        this.img = img;
        this.description = description;
        this.status = status;
        this.createTime = createTime;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
