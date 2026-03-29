package LecturesPrograms;

import java.util.Scanner;

public class OnetoN {
    public static void main(String[] args) {
        //Print the numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+ " ");
        }
    }
}
