package com.yyw.structure.composite;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by wangshuai on 2016/3/11.
 */
public class Client {
    public static String indentChar = "\t";//文件层次缩进字符

    public static void main(String args[]) {
        new Client().test();
    }

    public void test(){
        Folder root = new Folder("树根");

        Folder b1_1 = new Folder("1_枝1");
        Folder b1_2 = new Folder("1_枝2");
        Folder b1_3 = new Folder("1_枝3");

        File l1_1 = new File("1_叶1");
        File l1_2 = new File("1_叶2");
        File l1_3 = new File("1_叶3");

        Folder b2_1 = new Folder("2_枝1");
        Folder b2_2 = new Folder("2_枝2");
        File l2_1 = new File("2_叶1");
        File l2_2 = new File("2_叶2");

        root.add(b1_1);
        root.add(b1_2);
        root.add(b1_3);
        root.add(l1_1);
        root.add(l1_2);
        root.add(l1_3);

        b1_2.add(b2_1);
        b1_2.add(l2_1);

        b1_3.add(b2_2);

        b1_1.add(l2_2);

        outTree(root);

    }

    public void outTree(Folder folder) {
        System.out.println(folder.getName());
        iterateTree(folder);
    }

    /**
     * 遍历文件夹，输入文件树
     *
     * @param folder
     */
    public void iterateTree(Folder folder) {
        Vector<IFile> clist = folder.getAllComponent();
        //todo:遍历之前可以对clist进行排序，这些都不是重点
        for (Iterator<IFile> it = clist.iterator(); it.hasNext();) {
            IFile em = it.next();
            if (em instanceof Folder) {
                Folder cm = (Folder) em;
                System.out.println(getIndents(em.getDeep()) + cm.getName());
                iterateTree(cm);
            } else {
                System.out.println(getIndents(em.getDeep()) + ((File) em).getName());
            }
        }
    }

    /**
     * 文件层次缩进字符串
     *
     * @param x 缩进字符个数
     * @return 缩进字符串
     */
    public static String getIndents(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < x; i++) {
            sb.append(indentChar);
        }
        return sb.toString();
    }
}
