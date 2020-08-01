package replitPractice;
import java.util.Scanner;
public class PrintLongestWord {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE

        int l1 = word1.length();
        int l2 = word2.length();
        boolean lWord = l1 > l2 == true;

        String longestWord = (lWord) ? word1 : word2;
        System.out.println(longestWord);

    }
}
