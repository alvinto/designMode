package com.yyw.construction.factory.factoryMethod;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class BMW540 extends BMW {
    public BMW540(){
        System.out.println("制造---》BMW540");
    }


    public void BMW540Method1(){
        System.out.println("BMW540 方法1");
    }

    public void BMW540Method2(){
        System.out.println("BMW540 方法2");
    }
}
