package com.lcb.latte.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * @author lcb
 * @date 2020-11-11 16:35
 */
public class BallEntity implements MultiItemEntity {

    private int itemType = 0;
    public static final int TYPE_RED = 0;//添加一些类型数值
    public static final int TYPE_BLUE = 1;//添加一些类型数值


    private String value;


    public BallEntity() {
    }

    public BallEntity(String value) {
        this.value = value;
    }

    @Override
    public int getItemType() {
        return itemType;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}