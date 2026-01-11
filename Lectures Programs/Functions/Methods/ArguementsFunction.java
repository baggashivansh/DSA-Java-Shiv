package LecturesPrograms;

public class ArguementsFunction {
    public static void main(String[] args) {
        int ans = sum(3,5);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
