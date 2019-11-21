package com.example;

public class Main1 {
    public static void main(String[] args) {
        DLock lock=new DLock();
        lock.connect("127.0.0.1:2181", "/lock");
        lock.lockRead();
        System.out.println("I am testNode 1");
        try
        {
            System.out.println("I am TestNode 1");
            System.out.println("睡眠10s 之后释放分布式读锁, 开始倒计时");
            for (int i = 0; i < 10; i++)
            {
                System.out.println(10-i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        lock.unLockRead();
    }
}
