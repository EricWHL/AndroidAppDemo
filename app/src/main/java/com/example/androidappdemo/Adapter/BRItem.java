package com.example.androidappdemo.Adapter;

public class BRItem {

    private String mTitle;
    private String mContent;
    private String mImgUrl;

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setContent(String content) {
        this.mContent = content;
    }

    public CharSequence getContent() {
        return this.mContent;
    }

    public void setImgUrl(String imgUrl) {
        this.mImgUrl = imgUrl;
    }

    public String getmImgUrl() {
        return mImgUrl;
    }
}
