package com.Test;

import com.domain.Movie;

public class Test {
    public static void main(String[] args) {
        Movie movies1= new Movie(1,"水门桥", 38.9, 9.8, "徐克", "吴京","12万人想看");
        Movie movies2 = new Movie(2, "出拳吧", 39, 7.8, "唐晓白", "田雨","3.5万人想看");
        Movie movies3 = new Movie(3,"月球陨落", 42, 7.9, "罗兰", "贝瑞","17.9万人想看");
        Movie[] movies = {movies1,movies2,movies3};
        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.start();
    }
}
