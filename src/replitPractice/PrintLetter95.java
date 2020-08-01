package replitPractice;

import java.util.Scanner;

public class PrintLetter95 {
    /*
    Write a program that will print out letters
    in the alphabetic order accordingly to the given range within 2 chars.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 Chars: ");
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=start; i <= end; i++){
            for (int j= 0; j<=letter.length(); j++){
            }
            System.out.print(""+(char)i);
        }



    }
}
