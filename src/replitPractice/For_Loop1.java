package replitPractice;
import java.util.Scanner;
public class For_Loop1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        /*
Write a for loop that will loop through
every character of a word and print out each character, each on a separate line
         */
        for (int i = 0; i <= word.length()-1; i++){
          char ch = word.charAt(i);
            System.out.println(ch);
        }

    }
}
