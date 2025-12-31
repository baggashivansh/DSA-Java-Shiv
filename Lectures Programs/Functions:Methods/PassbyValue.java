package LecturesPrograms;

public class PassbyValue {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam){
        String name = "Shivansh Bagga";
    }


    /*
    Java me function call par VARIABLE kabhi pass nahi hota.
    Sirf VALUE pass hoti hai.

    Java me object ka reference value pass hota hai,
    aur reference ka reassignment caller ko affect nahi karta.


    sirf naam address ko point kr rha hai  object pr nhi
    new object create hota hai!


     */
}
