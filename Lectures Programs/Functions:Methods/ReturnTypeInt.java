package LecturesPrograms;

import java.util.Scanner;

public class ReturnTypeInt {
    public static void main(String[] args) {
//        System.out.println(sum());
        int ans = sum(); //storing the int value
        System.out.println(ans); // displaying the value
    }

    //Return the Value
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1= in.nextInt();
        System.out.print("Enter num2 : ");
        int num2= in.nextInt();
        int sum=num1+num2;
        System.out.print("Sum is : ");
        return sum;
        //function ends here // Khatam Tata Bye Bye goodbye gaya - Rahul Gandhi meme

        //System.out.println("THIS WILL NEVER EXECUTE"); //it will give error

    }
}

