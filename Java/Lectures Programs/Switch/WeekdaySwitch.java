package LecturesPrograms;

import java.util.Scanner;

public class WeekdaySwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String day = in.next();

        switch (day){
//            case "Monday" -> System.out.println("Weekday");
//            case "Tuesday" -> System.out.println("Weekday");
//            case "Wednesday" -> System.out.println("Weekday");
//            case "Thursday" -> System.out.println("Weekday");
//            case "Friday" -> System.out.println("Weekday");
//            case "Saturday","Sunday" -> System.out.println("Weekend")
//            default -> System.out.println("Not a Valid Day! Try Again!");

            //this can be written on the single line as well seperated by a " , "
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("Weekday");
            case "Saturday" , "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Not a Valid Day! Try Again!");

        }
    }
}
