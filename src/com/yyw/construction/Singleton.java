package com.yyw.construction;

/**
 * 单例模式 jdk1.5版本以上用枚举
 * Created by wangshuai on 2016/3/11.
 */
public enum Singleton {
    INSTANCE("实例1");

    private String name;
    Singleton(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void doSomeThing(){
        System.out.print("做些什么");
    }
}
