package com.company;

public class TEST {
    public static void func(A a,B b){
        System.out.println("FIRST");
    }
    public static void func(B b,A a){
        System.out.println("second");
    }
    public static void func(B a,B b){
    
sdfsdf    System.out.println("third");
    }
    public static void main(String[] args) {
        func(new A(),new C());
        System.out.println("Hello, World!");


    }
}
