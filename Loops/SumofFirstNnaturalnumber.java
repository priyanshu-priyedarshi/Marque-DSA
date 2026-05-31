package Loops;

import java.util.*;

public class SumofFirstNnaturalnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("give input : ");
        int n = sc.nextInt();

        int sum = 0;       // here the sum of all number is 0 

        int i = 1;         // i is basically the counter , and it will count till the users give the input , like if user gives the value of n = 5; then it will cout till the 5.

        while(i <= n){     // i will run till the value of n 
            sum += i;      // we will add i in sum 
            i++;
        }

        System.out.println("Sum is : " + sum);
    }
}