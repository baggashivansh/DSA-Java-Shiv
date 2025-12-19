package LecturesPrograms;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //keep taking inputs until user press x || X     ->making the whole calculator app

        Scanner in = new Scanner(System.in);

int ans=0;
        while (true){
            // using infinite loop
            System.out.print("Enter the operator :");
            char op = in.next().trim().charAt(0);  //taking operator as input
            if(op=='+' || op=='-'|| op=='*' || op=='/' || op=='%'){
                // input two numbers
                System.out.println();
                System.out.print("Enter num 1 : ");
                int num1 = in.nextInt();
                System.out.print("Enter num 2 : ");
                int num2 = in.nextInt();

                if (op =='+'){
                    ans= num1+num2;
                }
                if (op == '-') {
                    ans = num1-num2;
                }
                if (op == '*') {
                    ans = num1*num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }else {
                        System.out.println("Cannot divide by 0");
                        continue;
                    }
                }
                if (op == '%') {
                    ans = num1%num2;
                }
            } else if (op == 'x'|| op=='X') {
                break;
            }else {
                System.out.println("Invalid operation");
                continue;
            }
            System.out.println("Answer is : "+ans);
        }
    }
}


