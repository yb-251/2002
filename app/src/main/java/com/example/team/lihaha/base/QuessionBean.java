package com.example.team.lihaha.base;

public class QuessionBean {
    private String name;
    private String content;

    public QuessionBean(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public QuessionBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

