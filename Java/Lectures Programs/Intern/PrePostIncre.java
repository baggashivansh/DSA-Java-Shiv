package Basics;

public class PrePostIncre {
    public static void main(String[] args) {
        int num = 10;
      /*  System.out.println(num);
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);
        --num;
        System.out.println(num);
        ++num;
        System.out.println(num);
        */

        int res = num++; //fetch the value first then return
        System.out.println(res); // this returns the value of res
        System.out.println(num); //num has increased the value

        int num2=20;
        int res2 = --num2;
        System.out.println(res2);
        System.out.println(num2);

    }
}
