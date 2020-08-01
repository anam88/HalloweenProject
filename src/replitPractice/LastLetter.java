package replitPractice;

import java.util.Scanner;
/*
write a program that will print out the last letter of the word(string)
 */
public class LastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the word:");
        String word = scan.next();

        char lastLetter = word.charAt(word.length()-1);
        System.out.println(lastLetter);
    }
}
