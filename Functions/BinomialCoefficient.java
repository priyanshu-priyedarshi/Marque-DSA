package Functions;

public class BinomialCoefficient {

    public static int factorial(int n) {
        int fact = 1;          // here we need to declere the fact coz we use it later 

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int binomial(int n, int r) {
        int fact_n = factorial(n);       // here , firstly we we calculate the factorial of n 
        int fact_r = factorial(r);       // then we calculate the factorial of r 
        int fact_nmr = factorial(n - r); // now we calculate the factorial of n - r

        int binomial = fact_n / (fact_r * fact_nmr);   // let's take it n = a , r = b , n-r = c , then what we do is binomial = a / (b * c); 
        return binomial;
    }

    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
    }
}