package com.yyw.construction.factory.factoryMethod;

import com.yyw.construction.factory.SimpleFactory.*;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class BMW320 extends BMW {
    public BMW320(){
        System.out.println("制造---》BMW320");
    }

    public void BMW320Method1(){
        System.out.println("BMW320 方法1");
    }

    public void BMW320Method2(){
        System.out.println("BMW320 方法2");
    }
}
