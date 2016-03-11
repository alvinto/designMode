package com.yyw.construction.builder;

/**
 * 具体建造工具
 * Created by wangshuai on 2016/3/11.
 */
public class ConcreateBuilder implements Builder {
    Product product;

    ConcreateBuilder(){
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.setPartA("a");
        System.out.println("建造partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("b");
        System.out.println("建造partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("c");
        System.out.println("建造partC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
