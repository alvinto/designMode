package com.yyw.construction.factory.factoryMethod;

/**
 * 利用泛型及反射原理
 * Created by wangshuai on 2016/3/11.
 */
public abstract class Factory {
    public abstract <T extends BMW> T createBMW(Class<T> c);
}
