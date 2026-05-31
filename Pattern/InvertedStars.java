package Pattern;

public class InvertedStars {
    public static void main(String[] args){
        int n = 4;
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= n-line + 1; star++){     //it's basically number of star which is 4 (value of n = 4) , 4 - line number(lets take 1) , 4 - 1 + 1 = 4(the numbers of star we want for inverted star of the 1st line which is 4) , and this is what we do for rest all line in inner loop 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
