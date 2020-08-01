package replitPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VerifyContains68 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
Write a program that will
verify if word contains in the sentence.
Print out the result as boolean value.
 */
        System.out.println("Enter the word");
        String word = scan.nextLine();
        System.out.println("Enter the sentence");
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE

        System.out.println(sentence.contains(word));

    }
}
