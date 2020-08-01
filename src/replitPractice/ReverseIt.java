package replitPractice;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        int wordLength = word.length();
        if (wordLength == 5) {
            System.out.println("" + word.charAt(4) + word.charAt(3)
                    + word.charAt(2) + word.charAt(1) + word.charAt(0));
        }else if (wordLength > 5) {
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }




    }
}

