package com.example.commonadaptedemo.common;

import java.io.Serializable;

/**
 * Created by fszj on 2018-01-18.
 *
 * 实体类
 */

public class Bean implements Serializable {
    private String mImageUrl;
    private String name;
    private String sex;

    public Bean(String imageView, String name, String sex) {
        mImageUrl = imageView;
        this.name = name;
        this.sex = sex;
    }

    public String getImageView() {
        return mImageUrl;
    }

    public void setImageView(String imageView) {
        mImageUrl = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
