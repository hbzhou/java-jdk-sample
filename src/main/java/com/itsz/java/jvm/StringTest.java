package com.itsz.java.jvm;

public class StringTest {

    public static void main(String[] args) {
        String s1 = new String("Hello") + new String("World");
        String s2 = "HelloWorld";
        System.out.println(s1 == s2);
        String s3 = new String("HelloWorld");
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
    }
}
