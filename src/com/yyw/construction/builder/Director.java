package com.yyw.construction.builder;

/**
 * 建造者
 * Created by wangshuai on 2016/3/11.
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
