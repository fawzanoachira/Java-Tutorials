public class Pattern1 {

    public static void main(String[] args) {
        int number = 6;

        /* 
           *
           **
           ***
        */


        for (int i = 1; i <= number; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}