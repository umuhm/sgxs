package com.yw.sgxs.entity;

public class Detail {
    private int did;
    private int oid;
    private int fid;
    private String name;
    private String img;
    private double price;
    private int amount;

    public Detail() {
    }

    public Detail(int did, int oid, int fid, String name, String img, double price, int amount) {
        this.did = did;
        this.oid = oid;
        this.fid = fid;
        this.name = name;
        this.img = img;
        this.price = price;
        this.amount = amount;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
