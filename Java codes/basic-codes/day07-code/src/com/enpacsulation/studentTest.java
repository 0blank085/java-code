package com.enpacsulation;
/*
            封装的作用就是:
                合理隐藏，合理暴露!
                隐藏用户没必要使用的部分，暴露用户需要使用的部分!
*/
public class studentTest {
    public static void main(String[] args) {
        student stu = new student();
        /*
        这里就是使用了封装，导致用户不可以通过stu.age = ....
        的方式对类中的age进行更改，只可以通过setAge() 方法进行使用
         */
        stu.setAge(18);
        int age = stu.getAge();
        System.out.println(age);
    }

}
