package Basics;

public class ExplicitlyTypeCasting {
    public static void main(String[] args) {
        //assigning int to byte
        int a = 257;
        byte b = (byte)a; // it uses a modulo 257 % 256 that gives 1 so output would be 1.
        System.out.println(a);
        System.out.println(b);

        float f = 3.5f; // We loose out the decimal values if we do float to int or double to int.
        int g=(int)f;
        System.out.println(g);

        //Type Promotion
        byte c=10;
        byte d=30;
        // we know that byte * byte should be byte but the range of byte is upto 256 so java
        // automatically promotes it to int
        int res = c*d;
        System.out.println(res);

        float k = 10.324f;
        double x = 123.1213;
        float result = (float)(k*x);
        System.out.println(result);

        //Expression ka type decide hota hai → phir assignment hota hai




    }
}
