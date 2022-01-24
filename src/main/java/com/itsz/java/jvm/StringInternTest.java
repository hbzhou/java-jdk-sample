package com.itsz.java.jvm;


import org.junit.Assert;
import org.junit.Test;

public class StringInternTest {


    /**
     * String s1 = new String("a") + new String("b");不会在string常量池中创建常量 “ab”
     * 在调用s1.intern()方法后，会在常量池中创建，并且将s1的引用从对象指向常量池地址
     */
    @Test
    public void testStringIntern() {
        String s1 = new String("a") + new String("b");
        String s3 = s1.intern();
        String s2 = "ab";
        Assert.assertTrue(s1 == s2);
        Assert.assertTrue(s1 == s3);
        Assert.assertTrue(s2 == s3);
    }

    /**
     * 在调用s1.intern()前，因为已经给 s2赋值 “ab”,所以不会重新创建, s1的引用还是为
     * new StringBuilder().append("a").append("b").toString()生成的对象
     */
    @Test
    public void testStringIntern1() {
        String s1 = new String("a") + new String("b");
        String s2 = "ab";
        String s3 = s1.intern();

        Assert.assertFalse(s1 == s2);
        Assert.assertFalse(s1 == s3);
        Assert.assertTrue(s2 == s3);
    }

    /**
     * String s1 = new String("ab")会生成两个对象： 堆中String("ab")和String常量池中的 “ab”
     * s1.intern()返回的是常量池中的地址
     */
    @Test
    public void testStringIntern2() {

        String s1 = new String("ab");
        String s2 = s1.intern();
        String s3 = "ab";

        Assert.assertFalse(s1 == s2);
        Assert.assertFalse(s1 == s3);
        Assert.assertTrue(s2 == s3);
    }
}
