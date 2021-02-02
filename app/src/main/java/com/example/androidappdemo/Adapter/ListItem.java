package com.example.androidappdemo.Adapter;

public class ListItem {
    private int mImg;
    private String mName;

    public ListItem(int mImg, String mName) {
        this.mImg = mImg;
        this.mName = mName;
    }

    public void setImg(int mImg) {
        this.mImg = mImg;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getImg() {
        return mImg;
    }

    public String getName() {
        return mName;
    }
}
