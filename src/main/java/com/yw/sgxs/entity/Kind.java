package com.yw.sgxs.entity;

import java.sql.Timestamp;

public class Kind {
    private int kid;
    private String name;
    private int status;
    private Timestamp createTime;

    public Kind() {
    }

    public Kind(int kid, String name, int status, Timestamp createTime) {
        this.kid = kid;
        this.name = name;
        this.status = status;
        this.createTime = createTime;
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
