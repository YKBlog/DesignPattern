package com.design.create.singleton;

/**
 * 静态内部类方式
 * @Title: SingletonInnerClass.java
 * @Description: <br>
 * <br>
 * @Company: 美丽说
 * @Created on 2016年2月17日 下午4:48:36
 * @author yangkai
 * @version 1.0
 */
public class SingletonInnerClass {

    private static class Singleton {
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }

    private SingletonInnerClass() {
    }

    public static SingletonInnerClass getInstance() {
        return Singleton.instance;
    }
}
