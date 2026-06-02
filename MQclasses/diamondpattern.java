package MQclasses;

public class diamondpattern {
    public static void main(String[] args){
         for(int i = 1; i <= 5; i++) {

            // spaces
            for(int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }

            System.out.println();
        }

        // lower part
        for(int i = 4; i >= 1; i--) {

            // spaces
            for(int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }

            System.out.println();
        }
    }
}
