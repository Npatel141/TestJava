package org.example;

public class TestLoop {
    public void testForLoop() {

        // int i=1;
        for (int i = 1; i <= 10; i++) {
            // System.out.print("   "+i);
            for (int j = 1; j <= 10; j++) {//
                System.out.print(i + "*" + j + "=" + i * j + "\n");//
                // System.out.println();
            }
        }
    }
    public void testWhileloop(){
        int a=1;
        while ( a<=100){
            if(a%2==0) {
                System.out.println(a);//1
            }
            a++;


        }

    }
    public void testDoWhileloop(){
        int a=1;
        int b=20;
        do {
            System.out.println(a);
            //System.out.println("I am in london");
            a++;
        }while (a<=b);




    }
    public static void main(String args[]){
        TestLoop test_loop =new TestLoop();
        test_loop.testForLoop();
        test_loop.testWhileloop();
        test_loop.testDoWhileloop();
    }
}
