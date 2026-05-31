package Pattern;

public class StarPattern {
    public static void main(String[] args){
        for (int line = 1; line <= 4; line++){           //outer loop
            for (int star = 1; star <= line; star++){    //inner loop //star <= line , means each line contains as many stars as its line number
                System.out.print("*");
            }
            System.out.println();   // we do this , to go on next step if loop isn't satisfied 
        }
    }
}
