package com.lsh.day02;

import java.util.concurrent.TimeUnit;

/**
 * 创建一个死锁
 */
public class Demo01 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        new Thread(()->{
            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+"已经拿到o1锁,----尝试拿到o2锁");
                try {
                    TimeUnit.SECONDS.sleep(3L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"拿到o1 , o2 锁");
                }
            }
        },"AA---- ").start();
        new Thread(()->{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"已经拿到o2锁,++++尝试拿o1锁");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"拿到o1 , o2 锁");
                }
            }
        },"BB").start();
    }

}