package com.itsz.java.jvm;

/**
 * 赋值过程： 1.默认初始化  2.显性初始化 3.构造初始化  4.对象赋值
 */
public class FatherTest {

    public static void main(String[] args) {
        //先调用Father的初始化,再初始化自己。
        Father f = new Son();
        System.out.println(f.m);
    }

}

class Father {
    int m = 10;

    public Father() {
        print();
        m = 20;
    }

    public void print() {
        System.out.println("Father.m = " + m);
    }
}

class Son extends Father {
    int m = 15;


    public Son() {
        print();
        m = 40;
    }

    @Override
    public void print() {
        System.out.println("Son.m = " + m);
    }
}
