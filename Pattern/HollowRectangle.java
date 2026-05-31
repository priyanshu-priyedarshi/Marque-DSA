package Pattern;

public class HollowRectangle {
    public static void main(String[] args){
       int n = 6;

        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n; star++) {
                if (line == 1 || line == n || star == 1 || star == n) {      // || it's OR , and if one condition is true then the all value become true
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
