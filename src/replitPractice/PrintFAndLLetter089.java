package replitPractice;
import java.util.Scanner;
public class PrintFAndLLetter089 {
    public static void main(String[] args) {
        /*
       Write a program that will print out first and last letters together.
         */

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String f_Word = word.substring(0,1);
        String l_Word = word.substring(word.length()-1);
        System.out.println(f_Word+l_Word);
    }
}
