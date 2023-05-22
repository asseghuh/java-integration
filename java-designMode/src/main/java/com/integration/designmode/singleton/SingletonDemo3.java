package com.integration.designmode.singleton;

public class SingletonDemo3 {
    private static class Inner {
         private static final SingletonDemo3 instance = new SingletonDemo3();  
     }
     private SingletonDemo3(){
     }
     public static SingletonDemo3 getInstance(){  
         return Inner.instance;  
     }
     
     public static void main(String[] args) {
        SingletonDemo3 s1=SingletonDemo3.getInstance();
        SingletonDemo3 s2=SingletonDemo3.getInstance();
        System.out.println(s1.equals(s2));

     }
 }
