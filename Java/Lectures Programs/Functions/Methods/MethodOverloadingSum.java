package LecturesPrograms;

import java.util.Arrays;

public class MethodOverloadingSum {
    public static void main(String[] args) {

       int ans1=  sum(1,2);
       int ans2= sum(1,2,3);

        System.out.println(ans1);
        System.out.println(ans2);


        //for demo
        demo(1,2,3,4,4,5,4,123,41,21);
        demo("Shiv","Kunal","Sid");
    }

    static int sum(int a , int b){
        System.out.println("2 numbers sum");
        return a+b;
    }
    static int sum(int a , int b, int c){
        System.out.println("3 numbers sum");
        return a+b+c;
    }


    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
