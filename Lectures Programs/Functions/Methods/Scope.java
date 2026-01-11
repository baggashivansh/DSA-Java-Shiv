package LecturesPrograms;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        System.out.println("The above variables are local to main()");
        System.out.println("nums() uses its own separate local variables");

        int ans = nums();
        System.out.println(ans);



    }
    static int nums(){
        int a=40;
        int b= 40;
        int sum=a+b;
        return sum;
    }
}
