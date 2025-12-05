package LecturesPrograms;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer value: ");
        //taking integer as input
        int num = input.nextInt();
        System.out.println("The integer value is "+num);

        //taking float as input
        System.out.print("Enter the float value: ");
        float marks = input.nextFloat();
        System.out.println("The float value is "+marks);

        //taking double as input
        System.out.print("Enter the double value: ");
        double percentage = input.nextDouble();
        System.out.println("The percentage value is "+percentage);

        //taking long as input
        System.out.print("Enter the long value: ");
        long numbers = input.nextLong();
        System.out.println("The Long numbers value is "+numbers);






    }
}
