package com.yyw.construction.factory.factoryMethod;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class Client {
    public static void main(String[] args){
        BMWFactory bmw320Factory = new BMW320Factory();
        BMW bmw320 = bmw320Factory.createBMW();

        BMWFactory bmw540Factory = new BMW540Factory();
        BMW bmw540 = bmw540Factory.createBMW();
    }
}
