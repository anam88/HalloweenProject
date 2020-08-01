package replitPractice;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = input.next();

        int textLength = text.length();
        System.out.println(textLength);
    }
}
