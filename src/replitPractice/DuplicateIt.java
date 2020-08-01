package replitPractice;

import java.util.Scanner;

public class DuplicateIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = scan.next();
        String word2 = scan.next();

        String duplicateIt = word1.concat(word2)+word2.concat(word1);
        System.out.println(duplicateIt);
    }
}
