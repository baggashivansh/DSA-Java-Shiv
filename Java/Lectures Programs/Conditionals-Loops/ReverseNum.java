package LecturesPrograms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to print its reverse :");
        int num = in.nextInt();

        int rev = 0;
        while (num > 0) {
            int rem = num % 10;  //checks for the last digit
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.print("Reversed number is :" + rev);
    }
}

/*
            int ans = 0; //taking it as 0

            int rem =num % 10;              //checking the last digit
            num =num/ 10;                   //removing the last digit
            ans = ans * 10 + rem;           //storing it in answer
            System. out.println(ans)        //outputing the answer

*/