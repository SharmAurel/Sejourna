package com.example.myapplication;

public abstract class User {
private String ip;
private String loca;
public User(String ip,String loca)
{
    this.ip=ip;
    this.loca=loca;
}
    public String getLoca() {
        return loca;
    }

    public void setLoca(String loca) {
        this.loca = loca;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
