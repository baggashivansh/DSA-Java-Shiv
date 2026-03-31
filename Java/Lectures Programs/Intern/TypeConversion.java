package Basics;

public class TypeConversion {
    public static void main(String[] args) {
        // Type Conversion
        // Small to big , easy and no data loss
        int num = 1;
        double num1= num;

        // Type Casting
        // BIG -> Small  , data loss possible , type needed to be defined
        double num2 = 10.231654562;
        float num3 = (float)num2;


        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);


        int a = 10;
        int b = 3;
        double c= (double) a/b;
        System.out.println(c);

        byte f = 123;
        int g = (int)f;
        System.out.println(g);

        byte k = (byte) 129;
        int z = (int)k;
        System.out.println(z);
    }
}
