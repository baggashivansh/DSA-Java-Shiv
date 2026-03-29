package LecturesPrograms;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        //find the occurance of the digit
        Scanner in = new Scanner(System.in);
        System.out.print("Taking the input of a number : ");
        int n = in.nextInt();

        //to check for the occurance number
        //we are going to take input for that as well
        System.out.print("Enter the number to check :");
        int check = in.nextInt();
        int count = 0;

        while (n>0){
           int rem=n%10; // checks for the last digit
           if(check==rem){
               count++;
           }
           n=n/10; //removes the last digit
        }
        System.out.println(count);




    }
}
