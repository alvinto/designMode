package com.yyw.construction.builder;

/**
 * 建造工具
 * Created by wangshuai on 2016/3/11.
 */
public interface Builder {
    public void buildPartA();
    public void  buildPartB();
    public void buildPartC();

    public Product getResult();
}
