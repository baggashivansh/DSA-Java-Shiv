package LecturesPrograms;

import java.util.Scanner;

public class LowercaseOrUppercase {
    public static void main(String[] args) {
        //input a character and check whether it's an uppercase or lowercase
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Character ");
        char ch = in.next().trim().charAt(0);
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println("Lowercase");
//        }else {
//            System.out.println("Uppercase");
//        }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Not an alphabet");
        }


    }
}
