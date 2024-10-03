public class Pattern2 {

    public static void main(String[] args) {
        int number = 3;

        /* 
             *
            **
           ***
        */


        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}