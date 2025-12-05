package LecturesPrograms;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value in celcius :");
        float tempC=input.nextFloat();

        float tempFar=(tempC*9/5)+32;

        System.out.println("The temperature in Fahrenheit is "+tempFar);
    }
}
