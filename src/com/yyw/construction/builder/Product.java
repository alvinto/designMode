package com.yyw.construction.builder;

/**
 * 商品
 * Created by wangshuai on 2016/3/11.
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }



    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    @Override
    public String toString() {
        return partA+partB+partC;
    }
}
