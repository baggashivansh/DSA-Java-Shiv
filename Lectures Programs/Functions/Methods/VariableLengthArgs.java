package LecturesPrograms;

import java.util.Arrays;

public class VariableLengthArgs {
    public static void main(String[] args) {
        System.out.print("This is the program for Variable Length Arguments ");
        System.out.println();
        //fun(2,3,4,5,23,5235,23,5,234,234,234,23,42342); //this will print any number of Arguments

        multiple(1,2,"Shiv","Kunal","Rachit");

    }

    //this is how to decalare when we dont know how many inputs we are giving (..._name)
    //this will be stored as array of integers
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
    //what if we want to add multiple arguements
    static void multiple(int a, int b , String ...c){

    }
}
