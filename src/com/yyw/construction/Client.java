package com.yyw.construction;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class Client {
    public static void main(String[] args){
        /**单利模式测试**/
        Singleton.INSTANCE.doSomeThing();
        System.out.print(Singleton.INSTANCE.getName());
    }
}
