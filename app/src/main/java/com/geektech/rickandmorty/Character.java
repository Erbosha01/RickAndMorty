package com.geektech.rickandmorty;

import java.io.Serializable;

public class Character implements Serializable {
    private int image;
    private String detail;
    private String name;

    public Character(String detail, String name) {
        this.detail = detail;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character(int image, String detail, String name) {
        this.image = image;
        this.detail = detail;
        this.name = name;
    }
}
