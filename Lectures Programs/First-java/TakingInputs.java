package LecturesPrograms;

import java.util.Scanner;
//Scanner function is available in java.util package.

public class TakingInputs {
    public static void main(String[] args) {
        //This program shows the working of Scanner class how do we take inputs
        Scanner input = new Scanner(System.in);
        //new is a keyword
        //input = name of the object
        // system.in -> it means where are we taking input from and in this condition we are taking from the keyboard.

        //to print the input
        System.out.println(input.next()); //print till the space is entered -> used in strings
        // System.out.println(input.nextLine()); // prints the whole thing whatever is written in the command line
        // System.out.println(input.nextInt()); // prints out the integers values only

    }
}
