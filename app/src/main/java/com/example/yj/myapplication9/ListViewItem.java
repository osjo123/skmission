package com.example.yj.myapplication9;

import android.graphics.drawable.Drawable;

/**
 * Created by YJ on 2016-08-07.
 */
public class ListViewItem {
    private Drawable iconDrawable ;
    private String titleStr ;


    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }


    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }

}