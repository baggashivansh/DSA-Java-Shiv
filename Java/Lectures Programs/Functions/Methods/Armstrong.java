package LecturesPrograms;

import java.util.Scanner;

import static java.lang.System.in;

public class Armstrong {
    public static void main(String[] args) {
        //Print all the 3 digits armstrong numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num =in.nextInt();
        int original = num;

        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum = sum+cube;
            num = num / 10;
        }
        if (sum == original) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }


    }
}
