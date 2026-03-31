package Basics;

public class SwitchcaseExample {
    public static void main(String[] args) {
        // Optimized approach for the nested switch
        int age = 18;
        boolean hasID = true;

        if(age < 18) {
            System.out.println("Too young");
        } else if(!hasID) {
            System.out.println("ID missing");
        } else {
            System.out.println("Allowed");
        }
    }
}
