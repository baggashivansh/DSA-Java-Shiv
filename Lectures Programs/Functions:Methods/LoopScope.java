package LecturesPrograms;

public class LoopScope {
    public static void main(String[] args) {
//     int i=1;
//        for ( int i = 1; i <= 5; i++) {
//            System.out.print(i+"  ");
//        }
//        System.out.println(i); //you cant access i here czz its initialised in the particular loop only

        int i=1;
        for ( i = 1; i <= 5; i++) {
            System.out.print(i+"  ");
        }
        System.out.println(i); //you cant access i here czz its initialised in the particular loop only

        {
            // you cannot use i here
            for (int j = 0; j <= 5 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            System.out.println("I am outside the scope still accessible ");
            System.out.print(i+" "); //this will give 6 as output
        }
        System.out.println();
        System.out.print(i+" "); //this will give 6 as output


    }
}


//IN SIMPLEST FORM ANYTHING THAT IS INITIALISED OUTSIDE CAN BE USED INSIDE
//BUT
// ANYTHING THAT IS INITIALIZED INSIDE CANNOT BE USED OUTSIDE