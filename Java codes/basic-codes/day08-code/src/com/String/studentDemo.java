package com.String;

import com.domain.student;

public class studentDemo {
    public static void main(String[] args) {
        student s = new student("张三",25);
        s = new student("李梅", 18);
        System.out.println(s.getName() + " " + s.getAge());
    }
}
