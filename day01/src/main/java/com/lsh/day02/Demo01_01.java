package com.lsh.day02;

import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *使用lock的tryLock解决死锁
 */
public class Demo01_01 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(()->{
            lock.lock();
            try {
                System.out.println("come in----");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("leave out ----");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        },"AA---- ").start();

        new Thread(()->{

            //if(lock.tryLock()){
            try {
                if(lock.tryLock(3L,TimeUnit.SECONDS)){

                    System.out.println("BB come in -----");
                    try {
                    } finally {
                        lock.unlock();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("bb 直接离开");

        }).start();
    }
}
