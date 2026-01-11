package LecturesPrograms;

import java.util.Arrays;

public class ValueChangeFunction {
    public static void main(String[] args) {
        //ANY CHANGE MADE BY THE REF. VARIABLE WILL HAVE HAVE A CHANGE ON THE REAL OBJECT

        //create an array
        int[] arr = {1,3,4,45,6};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changeArr(int[] nums){
        //this changes the real object and in string new object is created
        nums[0]=99; //if you make a change to the object via this ref variable,same object will be changed
    }
}
