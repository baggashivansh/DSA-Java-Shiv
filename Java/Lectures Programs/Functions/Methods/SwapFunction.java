package LecturesPrograms;

public class SwapFunction {
    public static void main(String[] args) {
        System.out.println("this function is to run the swap");

/*

        int a = 10;
        int b = 20;
        //Swap numbers code
        int temp = a;   //storing value of a to temp;
        a=b;            //storing b value to a
        b= temp;        // storing temp value(previously a) to b;
        System.out.println(a + " "+ b);  //10, 20 is now 20,10

 */

        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a + " "+ b);


    }

    static void swap(int a, int b){
        int temp = a;   //storing value of a to temp;
        a=b;            //storing b value to a
        b= temp;        // storing temp value(previously a) to b;
    }

    /*
    Java me primitives (int, float, etc.) hamesha pass by value hote hain.

    a ki value → copy hoti hai
    b ki value → copy hoti hai
    Original variables kabhi pass nahi hote


    Java me primitives pass by value hote hain,
isliye function ke andar unka swap caller ko affect nahi karta.
     */

}
