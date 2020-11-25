package com.lsh.day01;


import java.util.HashSet;

public class Exer01 {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Exer01.bb(a);
        System.out.println(a);
    }
    public static void bb(Integer a){
        a+=3;
        HashSet<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(3);
        for (int ccc : integers){
            System.out.println(ccc);
        }
        int aa = 100;
        int bb = 100;
        System.out.println("1111111111111111111=="+((Integer)aa).equals(bb));
    }
}
