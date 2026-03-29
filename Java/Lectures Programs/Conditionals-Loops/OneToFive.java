package LecturesPrograms;

public class OneToFive {
    public static void main(String[] args) {

        //using for loops
        System.out.println("Using for loops");
        for (int num = 1; num <= 5 ; num++) {
            System.out.println(num);
        }

        //using while loops
        System.out.println();
        System.out.println("Using while loops");
        int num1=1;
        while (num1 <= 5) {
            System.out.println(num1);
            num1++;
        }



        //using do while loops
        System.out.println();
        System.out.println("Using do while loops");
        int num2=1;
        do{
            System.out.println(num2);
            num2++;
        }
        while (num2 <= 5);



    }
}
