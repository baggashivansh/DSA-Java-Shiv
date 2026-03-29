package LecturesPrograms;

public class ScopeBlock {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        String name ="Kunal";
        System.out.println(name);
        {

            // 'int a' is already initialised outside the block in the same method, hence you cannot in initialise again
            a=20; //but you can modify the value like this
            System.out.println(a); //a = 20 now
            int c = 200;
            System.out.println(c);

            //string example
            name = "Shivansh";
            System.out.println(name);

            String name1= "Namit";
            System.out.println(name1);
            //values initialised in this block, will remain in the block
        }

       // System.out.println(c); cannot use outside the block
        // System.out.println(name1); //you cannot access name 1 here

        System.out.println(a); // updated value will be returned
        System.out.println(name);


    }
}
