package com.example;

public class Main5 {
    public static void main(String[] args) {
        DLock lock=new DLock();
        lock.connect("127.0.0.1:2181", "/lock");
        lock.lockWrite();
        System.out.println("I am TestNode 5");
        lock.unLockWrite();
    }
}
