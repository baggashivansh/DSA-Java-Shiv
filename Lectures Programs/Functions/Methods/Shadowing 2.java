package LecturesPrograms;

public class Shadowing {

    static int x = 10; //this will be shadowed at line 24
    public static void main(String[] args) {
        //This is an example of Shadowing
        // basically means one name hides another name

        System.out.println("SHADOWING IS THE PROCESS_In the simplest term possible of using 2 variables with a same name within the scope that overlaps");
        System.out.println("it is a practice of using 2 variables with the same name within the scope that overlaps");

        System.out.println("this is accessed through main function");
        System.out.println(x);

        {
            System.out.println("this is accessed through inblock function");
            System.out.println(x);
        }

        random();

        System.out.print("X is initialised again so now it will return 40 see : ");
        int x = 40; //the class variable at line 14 is shadowed by this

        /*
        int x;
        System.out.println(x); //this will give error czz SCOPE WILL BEGIN WHEN THE VALUE IS INITIALISED
        x=40;
         */
        System.out.println(x); //this will give me 40 as answer

        System.out.print("X is initialsied in the function as 600 so it will return 600 now see : ");
        fun();

    }
   static void random(){
       System.out.print("this is accessed through Random function");
       System.out.print(x);
   }
   static void fun(){
        int x= 600;
       System.out.println(x);
   }
}
