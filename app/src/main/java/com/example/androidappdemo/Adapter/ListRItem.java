package com.example.androidappdemo.Adapter;

class ListRItem {
    private int mImg;
    private String mTitle;

    public ListRItem(int mImg, String title) {
        this.mImg = mImg;
        this.mTitle = title;
    }

    public void setImg(int mImg) {
        this.mImg = mImg;
    }

    public void setTitle(String mName) {
        this.mTitle = mName;
    }

    public int getImg() {
        return mImg;
    }

    public String getTitle() {
        return mTitle;
    }
}
