package com.yyw.construction.builder;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class Client {
    public static void main(String[] args){
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        System.out.print(product.toString());
    }
}
