package com.yw.sgxs.entity;

import java.sql.Timestamp;

public class Cart {
    private int cid;
    private int uid;
    private int fid;
    private int quantity;
    private int status;
    private Timestamp createTime;

    public Cart() {
    }

    public Cart(int cid, int uid, int fid, int quantity, int status, Timestamp createTime) {
        this.cid = cid;
        this.uid = uid;
        this.fid = fid;
        this.quantity = quantity;
        this.status = status;
        this.createTime = createTime;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
