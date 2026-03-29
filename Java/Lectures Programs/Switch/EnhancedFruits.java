package LecturesPrograms;

import java.util.Scanner;

public class EnhancedFruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Keeps the Doctor Away");
            case "Banana" -> System.out.println("A yellow fruit");
            case "Grapes" -> System.out.println("Bunch of green small fruits");
            default -> System.out.println("Eat some healthy foods");
        }
    }
    }

