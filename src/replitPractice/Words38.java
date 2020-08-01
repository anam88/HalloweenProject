package replitPractice;
import java.util.Scanner;

public class Words38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word1: ");
        String word1 = s.next();
        System.out.println("Enter word2: ");
        String word2 = s.next();

        //your code here
        boolean equalsToo = word1.equals(word2) == true;

        if(equalsToo){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }

    }
}
