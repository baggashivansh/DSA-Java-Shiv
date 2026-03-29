package LecturesPrograms;

import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        // input a salary and if the salary is greater than 20k give a bonus of 2k else 1k
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = in.nextInt();

        if (salary > 20000) {
            salary=salary+2000;
        }else {
            salary=salary+1000;
        }
        System.out.println("Your New Salary is Rupees "+salary);
    }
}
