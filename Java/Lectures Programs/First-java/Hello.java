package LecturesPrograms;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int a = 10;
        System.out.println(a);

        Scanner in = new Scanner(System.in);
        System.out.print("enter a number : ");
        int num = in.nextInt();
        System.out.println(num);

        System.out.print("enter a String : ");
        String name = in.next();
        System.out.println(name);

        System.out.println("Enter a float number");
        float num1 = in.nextFloat();
        System.out.println(num1);

        //next line vs next
        System.out.println("Enter 2 strings");
        String st1 = in.next();
        System.out.println(st1);
        System.out.println("this reads the first word  ");

        String str2 = in.nextLine();
        System.out.println(str2);
        System.out.println("this reads the whole line");


    }
}
