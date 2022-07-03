package org.example;

public class Test_Variable {
     int a=10;//global variable
    public static void m1(){
        int a=20;//local
        int b=30;//local
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        int a=20;//instance variable
        System.out.println(a);
        Test_Variable test_variable=new Test_Variable();
        System.out.println(test_variable.a);
        m1();
    }
}
