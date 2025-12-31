package LecturesPrograms;
public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
       random(56);
        {
            int avg = 10;
            System.out.println(avg);
        }


    }
    static void random(int marks){
        int nums = 67;
        System.out.println(nums);
        System.out.println(marks);
    }
}
