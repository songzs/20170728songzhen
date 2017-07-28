package com.bwei.songzhen.entity;

import javax.persistence.Entity;

/**
 * Created by songzhen on 2017/7/28.
 */
@Entity
public class User {
    private int id;
    private String username;
    private String password;
    private int age;
    private String six;
    private String txiang;
    private String hobby;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getTxiang() {
        return txiang;
    }

    public void setTxiang(String txiang) {
        this.txiang = txiang;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
