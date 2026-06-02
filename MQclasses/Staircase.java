package MQclasses;

public class Staircase {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int r = 1; r <= 2; r++) {

                for (int j = 1; j <= i * 2; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}