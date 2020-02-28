package com.yw.sgxs.entity;

import java.sql.Timestamp;

public class Orders {
    private int oid;
    private int uid;
    private int aid;
    private int status;
    private Timestamp createTime;

    public Orders() {
    }

    public Orders(int oid, int uid, int aid, int status, Timestamp createTime) {
        this.oid = oid;
        this.uid = uid;
        this.aid = aid;
        this.status = status;
        this.createTime = createTime;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
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
