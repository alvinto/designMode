package com.yyw.structure.composite;

/**
 * 抽象文件角色
 * Created by wangshuai on 2016/3/11.
 */
public interface IFile {
    /**返回自己的实例*/
    IFile getComposite();

    /**某个商业方法**/
    void sampleOpration();

    /**获取深度*/
    int getDeep();

    /**设置深度*/
    void setDeep(int x);
}
