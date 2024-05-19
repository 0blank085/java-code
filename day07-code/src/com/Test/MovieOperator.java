package com.Test;

import com.domain.Movie;

import java.util.Scanner;

public class MovieOperator {
//    启动电影管理系统
    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }
    Scanner sc = new Scanner(System.in);
    public void start() {
        lo:
        while (true) {
            System.out.println("------电影管理系统------");
            System.out.println("输入1查询电影信息");
            System.out.println("输入2通过id查询电影信息");
            System.out.println("输入3退出系统");
//        System.out.println("输入1");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    show();
                    break;
                case 2:
                    showID();
                    break;
                case 3:
                    System.out.println("欢迎您的使用，下次见");
                    break lo;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
    }

    private void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影的名称查询电影信息!");
        String name = sc.nextLine();
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getName().equals(name)) {
                System.out.println("电影id为" + movies[i].getId() + ',' + "电影名称为" + movies[i].getName() + ',' + "电影单价为" + movies[i].getPrice() + ',' + "电影主演为" + movies[i].getActor() + ',' + "电影导演为" + movies[i].getDirector() + ',' + "电影热度为" + movies[i].getInfo() + '。');
            }
        }
        }
    private void showID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影的ID查询电影信息!");
        int choice = sc.nextInt() - 1;
        System.out.println("电影id为" + movies[choice].getId() + "电影名称为" + movies[choice].getName() + "电影单价为" + movies[choice].getPrice() + "电影主演为" + movies[choice].getActor() + "电影导演为" + movies[choice].getDirector() + "电影热度为" + movies[choice].getInfo());
    }
    }

