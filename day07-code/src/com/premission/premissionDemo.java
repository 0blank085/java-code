package com.premission;
/*
    权限修饰符:

                private: 限定属性和方法只能在同一个类中使用
                (default): 限定属性和方法只能在同一个类或包中使用[注意: default 代表的是默认状态，也就是没有添加权限修饰符的状态，并不是在属性或方法前加上default!!!
                protected: 限定属性和方法只能在同一个类或包或包的子类中使用!! => 它与继承有关 暂时不管(此处暂时指的是学习继承之前)
                public: 可以在任意位置访问属性或方法,但是这里的任意不可以跨模块，不可以跨项目!!!
 */
public class premissionDemo {
    public static void main(String[] args) {
        premissionDemo demo = new premissionDemo();

    }
}
