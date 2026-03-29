package LecturesPrograms;

import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        //calling a function
        sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
       int num1= in.nextInt();
        System.out.print("Enter num2: ");
        int num2= in.nextInt();
       int sum=num1+num2;
        System.out.print("Sum is: ");
        System.out.println(sum);
    }
}


    /*
        This is a very lengthy process
        //take input of 2 numbers and print the sum
        //you can declare the variables here
        int num1,num2,sum;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1= in.nextInt();
        System.out.print("Enter num2: ");
        num2= in.nextInt();
        sum=num1+num2;
        System.out.print("Sum is: ");
        System.out.println(sum);

     */