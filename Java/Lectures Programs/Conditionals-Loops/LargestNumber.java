package LecturesPrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        //Take 3 numbers as input and print the max
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers: " );
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();

        int max=a;//assuming
        if(b>max){
            max=b;
        }
        if (c > max) {
            max=c;
        }
        System.out.println(max);

    }
}
