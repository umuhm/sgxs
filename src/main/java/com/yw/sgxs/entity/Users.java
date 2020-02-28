package com.yw.sgxs.entity;

import java.sql.Timestamp;

public class Users {
    private int uid;
    private String username;
    private String password;
    private String tel;
    private String email;
    private int status;
    private Timestamp createTime;

    public Users() {
    }

    public Users(int uid, String username, String password, String tel, String email, int status, Timestamp createTime) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.email = email;
        this.status = status;
        this.createTime = createTime;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
