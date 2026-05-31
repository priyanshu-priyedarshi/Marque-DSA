package Pattern;

public class CharacterPattern {
    public static void main(String[] args){
        int n = 4;
        char ch = 'A';
        for(int line = 1; line <= n; line++){
            for(int chars = 1; chars <= line; chars++){     // noting just take char ch = 'A'; else everything was same
                System.out.print(ch);
                ch++;                                       // and this too , we need to do increment here to exceed the text 
            }
            System.out.println();
        }
    }
}
