package Functions;

import java.util.Scanner;

public class BasicExampleofFunction {
    public static void calculateSum(int num1 ,  int num2) {    // parameters or formal parameters
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        calculateSum(a , b);            // arguments or actual parameters
    }
}