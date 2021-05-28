package com.zlx.demo.entity;

public class User {
    private int id;
    private String url;
    private float tem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getTemp() {
        return tem;
    }

    public void setTemp(float tem) {
        this.tem = tem;
    }

//    //構造器，初始化時必須賦值
//    public UserEntry(int id, String url, float temperature) {
//        this.id = id;
//        this.url = url;
//        this.temperature = temperature;
//    }



}
