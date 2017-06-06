package com.java.base;

public class Demo {
    static int i;
    int j;
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        obj1.i = 10;
        obj1.j = 20;
       
        Demo obj2 = new Demo();
       
        System.out.println("obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
        System.out.println("obj2.i=" + obj2.i + ", obj2.j=" + obj2.j);
    }
}