package com.example.deepakrattan.recyclerviewdemo;

/**
 * Created by Deepak Rattan on 05-Mar-17.
 */

public class ListItem {
    private String titile, desc;
    private int image;

    public ListItem(String titile, String desc, int image) {
        this.titile = titile;
        this.desc = desc;
        this.image = image;
    }

    public String getTitile() {
        return titile;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
