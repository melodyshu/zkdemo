package com.example;

public class Main4 {
    public static void main(String[] args) {
        DLock lock=new DLock();
        lock.connect("127.0.0.1:2181", "/lock");
        lock.lockRead();
        System.out.println("I am TestNode 4");
        lock.unLockRead();
    }
}
