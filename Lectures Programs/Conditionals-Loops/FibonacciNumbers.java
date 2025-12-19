package LecturesPrograms;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //print the nth fibonacci number
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Nth Term: ");
        int n = in.nextInt();

        int previous = 0;
        int current = 1;
        int count = 2;
        while (count<=n){
            int temp = current;
            current = previous+current;
            previous = temp;
            count++;
        }
       System.out.println("Current Fibonacci number is "+current);



        /*
        int A = 0;   // previous
        int B = 1;   // current
        int count = 2;

        while (count <= n) {
            int temp = B;
            B = A + B;
            A = temp;
            count++;
        }

        System.out.println(B);
    }
         */
    }
}
