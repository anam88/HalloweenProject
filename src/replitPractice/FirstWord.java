package replitPractice;

import java.util.Scanner;

public class FirstWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.next();

        char firstWord = word.charAt(0);
        System.out.println(firstWord);

    }
}
