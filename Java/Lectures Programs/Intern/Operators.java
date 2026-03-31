package Basics;

public class Operators {
    public static void main(String[] args) {
        //Operators
        // add +  subtract-  multiply*  Divide/  modulo% (remainder of 2 numbers)
        int num1 = 1;
        int num2 = 2;

        int sum = num1+num2;
        int sub = num1-num2;
        int multi = num1*num2;
        //int div = num1/num2; // this will lose out the decimal values
        double div = (double)num1/num2; // this will not lose out the decimal values
        int mod = num1%num2;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);


    }
}
