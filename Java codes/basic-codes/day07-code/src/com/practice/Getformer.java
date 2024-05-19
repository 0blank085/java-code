package com.practice;

/*
    构造方法:
        创建对象时就执行的方法

        格式:
            1.方法名与类名相同，大小写也一样!
            2.没有返回值类型，连void都没有！
            3.没有具体的返回值（不能由return带回返回值)

            代码执行时机: 在创建对象的时候执行，而且每创建一次对象就会执行一次构造方法!

            构造方法的作用:
                本质作用: 创建对象
                结合时机: 可以再创建对象时,给对象中的数据初始化

            构造方法的注意事项:
                一个类中若没有定义构造方法则系统会给这个类中添加一个【默认的】【无参数】的构造方法，若手动编写了一个构造方法，这时系统就不会提供默认的构造方法了！
                构造方法也是方法，它也存在方法的重载!


*/
public class Getformer {
    int age;
    String name;
    //前面两个为成员变量，所以下面的两个才要使用this
    public Getformer(int age, String name) {
        this.age = age;
        this.name = name;
//        这里this的作用是将局部变量赋值给成员变量，this.age和this.name是成员变量，age 和 name 是在Getformer中存在的局部变量
        System.out.println("我是构造方法!");
    }
}
