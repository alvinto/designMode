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

        Factory factory = new ConcreateFactory();
        BMW320 bmw3200 = factory.createBMW(BMW320.class);
        BMW540 bmw5400 = factory.createBMW(BMW540.class);

        bmw3200.BMW320Method1();
        bmw3200.BMW320Method2();
        bmw5400.BMW540Method1();
        bmw5400.BMW540Method2();
    }
}
