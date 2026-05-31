package Loops;

public class PrintReverseofaNumber {
    public static void main(String[] args) {
        int n = 1742004;

        while(n > 0) {
            int lastDigit = n % 10;                //see if you want last digit of any number then % 10
            System.out.print(lastDigit + " ");
            n = n / 10;           // here we divided n by 10 because we need to shot the numberse also                 // but if you want to remove the last digit then you shoud have to / 10 
        }
        System.out.println();
    }
}
