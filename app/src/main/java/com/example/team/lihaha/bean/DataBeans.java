package com.example.team.lihaha.bean;

public class DataBeans {
    private int img;
    private String title;
    private String content;

    public DataBeans() {
    }

    public DataBeans(int img, String title, String content) {
        this.img = img;
        this.title = title;
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DataBeans{" +
                "img=" + img +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
