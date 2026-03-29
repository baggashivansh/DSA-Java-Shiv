package LecturesPrograms;

import java.util.Scanner;

public class StringControl2 {
    public static void main(String[] args) {
            /*
        🟡 Level 2 — Catch the trap
        👉 Take:
        age (int)
        full name (string)
        ⚠️ Expected bug will happen.
        👉 Fix it properly.
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = in.nextInt();
        System.out.println(age);
        in.nextLine(); //Deletes out the buffer

        System.out.print("Enter your name : ");
        String name = in.nextLine();
        System.out.println(name);

    }
}
