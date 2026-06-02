package MQclasses;
import java.util.*;
public class OctaltoBinary {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.print("Enter octal number: ");
        int octal = sc.nextInt();

        String binary = "";

        while (octal != 0) {

            int digit = octal % 10;

            switch (digit) {
                case 0: binary = "000" + binary; break;
                case 1: binary = "001" + binary; break;
                case 2: binary = "010" + binary; break;
                case 3: binary = "011" + binary; break;
                case 4: binary = "100" + binary; break;
                case 5: binary = "101" + binary; break;
                case 6: binary = "110" + binary; break;
                case 7: binary = "111" + binary; break;

                default:
                    System.out.println("Invalid octal number");
                    return;
            }

            octal = octal / 10;
        }

        System.out.println("Binary number: " + binary);
    }
}
    