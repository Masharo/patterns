package com.masharo.lesson5Singleton;

public class SingletonClass {

    private volatile static SingletonClass SINGLETON_CLASS;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (SINGLETON_CLASS == null) {
            synchronized (SingletonClass.class) {
                if (SINGLETON_CLASS == null) {
                    SINGLETON_CLASS = new SingletonClass();
                }
            }
        }

        return SINGLETON_CLASS;
    }
}
