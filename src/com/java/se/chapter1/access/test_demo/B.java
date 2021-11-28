package com.java.se.chapter1.access.test_demo;

import com.java.se.chapter1.access.mytest_demo.A;

public class B extends A {
    public void test()  {
        this.fun();
        super.fun();
//        new A().fun();//编译异常，没有访问权限
    }
}
