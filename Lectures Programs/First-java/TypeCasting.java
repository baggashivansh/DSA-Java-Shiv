package LecturesPrograms;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Value: ");
//        //i am taking float value as an input
//        float num= input.nextFloat();
//        System.out.println(num);
//        // i will enter the integer value still i will get the float as an output

        //When does this happens TypeConversion Happens

        //1. The two types should be compatible
        //2.Destination type should be greater than the source type
        // float > int (integer you can add integer values only but in float you can add both integer and float)
        //its like whatever you have on the left side should be greater then the right hand side

        // type casting
//        int num1 = (int) (67.56f); // conversing the value to float to int explicitly
//        System.out.println(num1);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);  // 257 % 256 = 1
//        System.out.println(b);


//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d= a * b / c;
//        System.out.println(d);

//        byte b = 50;
//        b = b * 2;
        // you cant do this
        //b (byte) promoted to int
        //2 is int
        //b * 2 results in int
        //You are trying to store int into byte → narrowing
        //Compilation error unless you cast: explicitly

        //Java follows unicode
        // if you want to print namaste or anything in chinese or anything you can do it on java


        // All in one type conversion example

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f *b) + (i / c) - (d * s);
        System.out.println((f *b) +" "+ (i / c) +" "+  (d * s));
        //float + int - double = double
        System.out.println(result);

        //“Double dominates.”
        //If double appears anywhere, the whole expression becomes double.





    }
}
