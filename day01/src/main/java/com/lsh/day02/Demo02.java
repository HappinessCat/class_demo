package com.lsh.day02;

import java.util.Arrays;
import java.util.Random;


public class Demo02 {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        while (1==1){
            System.out.println(new Random().nextInt(3));
        }
    }
}
