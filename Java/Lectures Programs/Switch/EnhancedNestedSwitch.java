package LecturesPrograms;

import java.util.Scanner;

public class EnhancedNestedSwitch {
    public static void main(String[] args) {
        System.out.println("This is an example of nested switch case");
        System.out.println("FOOD MENU");
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Starters : ");
        System.out.println("Enter 2 for Main Course : ");
        System.out.println("Enter 3 for Drinks : ");
        int num = in.nextInt();

        switch (num) {
            case 1 -> {
                System.out.println("Starters Menu");
                System.out.println("Enter 1 for Soup");
                System.out.println("Enter 2 for Rolls");
                int starter = in.nextInt();

                switch (starter) {
                    case 1 -> System.out.println("You selected soup");
                    case 2 -> System.out.println("You selected Rolls");
                    default -> System.out.println("Invalid starter");
                }
            }
            case 2 -> System.out.println("You choose main course");
            case 3 -> System.out.println("You selected Drinks");
            default -> System.out.println("Sorry Unavailable");
        }
    }
}
