package com.yyw.construction.factory.factoryMethod;

/**
 * 利用泛型及反射原理
 * Created by wangshuai on 2016/3/11.
 */
public class ConcreateFactory extends Factory{
    @Override
    public <T extends BMW> T createBMW(Class<T> c) {
        T bmw = null;
        try {
            bmw = (T)Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return bmw;
    }
}
