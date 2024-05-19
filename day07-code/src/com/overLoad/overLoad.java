package com.overLoad;
/*
    方法的重载其实就是指的方法的名字相同但是方法中的参数不同！

    识别方法:
        方法重载的识别方式是只识别方法的名字和参数，不识别方法的返回值!
 */
public class overLoad {
    public void overLoad(int a, int b) {
        System.out.println(a + b);
    }
    public void overLoad(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
