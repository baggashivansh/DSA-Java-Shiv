package Basics;

public class IfElse {
    public static void main(String[] args) {

        /*
        Q1 (basic decision)
        👉 Input: a number
        👉 Output: positive, negative, or zero

        int num = -45;
        if (num>0){
            System.out.println("Positive Number");
        } else if (num<0) {
            System.out.println("Negative Number");
        } else if (num == 0) {
            System.out.println("You Entered 0");
        }else{
            System.out.println("Enter a number please");
        }
        */

/*
        Q2 (even or odd + extra check)
        👉Input: a number
        👉 Output:
        Even and > 10
        Even and <= 10
        Odd
 */
      /*
        int num = 10;
        if (num % 2 == 0 && num > 10) {
            System.out.println("Even and > 10");
        } else if (num % 2 == 0 && num <= 10) {
            System.out.println("Even and <= 10");
        } else {
            System.out.println("Odd Number");
        }
*/
        /*
        Q3 (largest of 3 numbers)
        👉 Input: a, b, c 👉 Output: largest number
        ⚠️ Don’t use Math.max Use pure if else
         */

        int a = 10;
        int b = 20;
        int c = 30;
        int max = a;
        if (b>max) {
            max = b;
        }else if (c>max) {
            max = c ;
        }
        System.out.println(max);



    }
}

