package com.example.team.lihaha.bean;

public class DingDanBean {
    private String phone;
    private String name;
    private String time;
    private String price;

    public DingDanBean() {
    }

    public DingDanBean(String phone, String name, String time, String price) {
        this.phone = phone;
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
