package com.yyw.structure.composite;

/**
 * 文件角色
 * Created by wangshuai on 2016/3/11.
 */
public class File implements IFile{
    private String name;
    private int deep;

    public File(String name) {
        this.name = name;
    }

    @Override
    public IFile getComposite() {
        return this;
    }

    @Override
    public void sampleOpration() {
        System.out.print("执行了某个商业方法");
    }

    @Override
    public int getDeep() {
        return deep;
    }

    @Override
    public void setDeep(int x) {
        deep = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
