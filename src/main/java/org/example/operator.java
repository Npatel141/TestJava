package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class operator {
    //Unary operators
    int x = 10;

    public static void m1() {
        //Unery operator
        int x = 20;
        System.out.println(x++);//20(21)
        System.out.println(++x);//22
        System.out.println(--x);//21
        System.out.println(--x);//20
        System.out.println(x++);//20(21)
        System.out.println((++x));//22
        System.out.println(x--);//22(21)
        System.out.println(x-- + x++);//21+20==41
        System.out.println(--x + ++x);//40+41
    }

    public static void m2() {
        //arithmatic opperator
        int a = 40;
        int b = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
    public static void m3(){
        //logical operator  && and ||
        int c ,d,e;
        Scanner scanner=new Scanner(System.in);
        c=scanner.nextInt();
        d=scanner.nextInt();
        e=scanner.nextInt();
        if(c>d&&c>e){
            System.out.println(c + "\n c: is the lagest number");
        }else if(d>c&&d>e){
            System.out.println(d + "\n:d is the largest number");
        }else{
            System.out.println(e + "\n:e  is the largest number");
        }


    }
    public static void m4(){
        //assignment operators +=, -=,*=,/=
        int a=10;
        int b=20;
        a+=4;
        System.out.println(a);//14
        a*=b;
        System.out.println(a);//280
    b+=a;
        System.out.println(b);//300


    }

    public static void main(String args[]) {
       // m1();
       // m2();
       // m3();
        m4();
    }
}
