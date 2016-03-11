package com.yyw.structure.composite;

import java.util.Vector;

/**
 * 文件夹角色
 * Created by wangshuai on 2016/3/11.
 */
public class Folder implements IFile{
    /**文件名字*/
    private String name;
    /**深度*/
    private int deep;
    /**存储的内容*/
    private Vector<IFile> componentVector = new Vector<IFile>();

    public Folder(String name) {
        this.name = name;
    }
    /**增加一个文件夹或文件**/
    public void add(IFile iFile){
        componentVector.addElement(iFile);
        iFile.setDeep(++deep);
    }
    /**删除一个文件夹或文件**/
    public void remove(IFile iFile){
        componentVector.removeElement(iFile);
    }
    /**返回直接子文件（夹）**/
    public Vector<IFile> getAllComponent() {
        return componentVector;
    }

    public String getName() {
        return name;
    }

    @Override
    public IFile getComposite() {
        return this;
    }

    @Override
    public void sampleOpration() {
        System.out.print("某个商业方法");
    }

    @Override
    public int getDeep() {
        return deep;
    }

    @Override
    public void setDeep(int x) {
        deep = x;
    }
}
