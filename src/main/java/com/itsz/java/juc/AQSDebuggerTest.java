package com.itsz.java.juc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AQSDebuggerTest {


    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Thread(() -> {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "entering");
                Thread.sleep(60000 * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "thread1").start();
        Thread.sleep(1000);
        new Thread(() -> {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " entering");
            } finally {
                lock.unlock();
            }
        }, "thread2").start();

        new Thread(() -> {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " entering");
            } finally {
                lock.unlock();
            }
        }, "thread3").start();


    }
}
