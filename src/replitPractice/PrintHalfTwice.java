package replitPractice;

import java.util.Scanner;

public class PrintHalfTwice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        //WRITE YOUR CODE HERE
        int midIndex = word.length() / 2; //will give us middle index
        String firstHalf = "";
        String result = "";

        firstHalf = word.substring(0,midIndex);
        //           0 index till middle index
        result = firstHalf + firstHalf;
        System.out.println(result);
    }
}
