package com.yyw.construction.factory.SimpleFactory;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class Client {
    public static void main(String[] args){
        BMWFactory bmwFactory = new BMWFactory();
        BMW bmw320 = bmwFactory.createBMW(320);
        BMW bmw540 = bmwFactory.createBMW(540);
    }
}
