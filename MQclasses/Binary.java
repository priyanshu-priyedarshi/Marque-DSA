package MQclasses;

public class Binary {
    public static void main(String[] args) {
       /* int number = 100;

        String binary = Integer.toBinaryString(number);

        System.out.println("Binary of number is: " + binary);*/

        int num = 100;
        String binary = "";
        while(num>0){
            int remain=num%2;
            binary=remain + binary;
            num=num/2;
        }
        System.out.println(binary);
    }
}
