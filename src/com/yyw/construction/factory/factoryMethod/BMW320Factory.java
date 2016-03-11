package com.yyw.construction.factory.factoryMethod;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class BMW320Factory implements BMWFactory{

    @Override
    public BMW createBMW() {
        return new BMW320();
    }
}
