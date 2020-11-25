package com.lsh.day02;

import java.util.Random;

/**
 * 写一个死循环,分析生产环境服务器变慢
 */
public class Demo02 {
    public static void main(String[] args) {
        while (true){
            System.out.println(new Random().nextInt(3));
        }
    }
}
