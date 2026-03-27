package LecturesPrograms;

import java.util.Scanner;

public class StringControl {
    public static void main(String[] args) {
        //Write a program
        //full name
        //age
        //city

        Scanner in = new Scanner(System.in);
        System.out.print("Write your full name : ");
        String name = in.nextLine();

        System.out.print("Write your age : ");
        int age = in.nextInt();

        System.out.print("Write your city name : ");
        String city = in.next();

        System.out.println("My name is "+name +",my age is "+age+",my city is "+city);

    }
}
