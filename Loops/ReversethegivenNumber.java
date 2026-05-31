package Loops;
import java.util.*;

public class ReversethegivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int rev = 0;

        while(n > 0){                // till n is > 0 
            int lastDigit = n % 10;  // we will calculate the lastDigit
            rev = (rev * 10) + lastDigit;   // here we take the value of reverse = 0 , because if we take (0 x 10) + lastDigit  , 0 x 10 = 0  , so basically it just the last number what we get 
            n = n / 10;              // for updation
        }

        System.out.println("Reversed number: " + rev);

        sc.close();
    }
}