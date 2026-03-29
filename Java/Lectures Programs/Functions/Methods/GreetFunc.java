package LecturesPrograms;

import java.util.Scanner;

public class GreetFunc {
    public static void main(String[] args) {
        greet();
    }
     static void greet(){
         Scanner in = new Scanner(System.in);
         System.out.print("Enter your Name: ");
         String name= in.next();
         System.out.println("Hello "+name);
     }
}

