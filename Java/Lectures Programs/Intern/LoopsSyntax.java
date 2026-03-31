package Basics;

public class LoopsSyntax {
    public static void main(String[] args) {
        int i=1;
        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }

        while (i<3){
            System.out.println("i");
            i++;
        }

        do{
            System.out.println(i);
            i++;
        }while (i<3);
    }
}
