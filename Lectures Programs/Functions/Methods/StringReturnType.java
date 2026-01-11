package LecturesPrograms;

import java.util.Scanner;

public class StringReturnType {
    public static void main(String[] args) {
//        String message=name();
//        System.out.println(message);

     //   String personalised = mygreet("Shiv");

       //taking name as input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String naam = in.next();
        String personalised = mygreet(naam);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String message = "hello "+name;
        return message;
    }

    static String name(){
        String greeting = "Hello! How are you?";
        return greeting;
    }
}
