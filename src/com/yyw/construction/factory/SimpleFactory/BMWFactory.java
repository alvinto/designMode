package com.yyw.construction.factory.SimpleFactory;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class BMWFactory {
    public BMW createBMW(int type){
        switch(type){
            case 320:
                return new BMW320();
            case 540:
                return new BMW540();
            default:break;
        }
        return null;
    }
}
