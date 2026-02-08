package LecturesPrograms;

public class MethodOverloading {

    public static void main(String[] args) {
        //Same name different parameters
        fun(10);
        fun("Shivansh");
    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }

}
