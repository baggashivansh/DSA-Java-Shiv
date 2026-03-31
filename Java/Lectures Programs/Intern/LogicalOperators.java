package Basics;

public class LogicalOperators {
    public static void main(String[] args) {
        // && AND operator  ->Both the condition must be true
        // || OR operator   -> Either of the condition must be true

        int a = 10;
        int b = 15;
        int x = 20;
        int y = 25;

        boolean result = a>b || x>y;
        System.out.println(result);


    }
}
