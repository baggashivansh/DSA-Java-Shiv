package LecturesPrograms;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
            //print the nth fibonacci series
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the Nth Term: ");
            int n = in.nextInt();

            int previous = 0;
            int current = 1;
            int count = 2;
            System.out.print(previous+" "+current);
            while (count<=n) {
                int temp = current;
                current = previous + current;
                previous = temp;
                count++;
                System.out.print(" " + current);
            }

        }
}
