package replitPractice;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {
        /*
        Given a string word, if the first or last chars are 'x' or 'X',
        print the string without those 'x' or 'X' chars,
        otherwise print the string unchanged.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scan.next();

        char ch1 = word.charAt(0);//first letter x or X
        char ch2 = word.charAt(word.length()-1); //last letter x or x

        boolean f_Letter = ch1 == 'x' || ch1 == 'X';
        boolean l_Letter = ch2 == 'x' || ch2 == 'X';

        if(f_Letter && l_Letter){
            //if first and last letter is x or X print without them
            System.out.println(word.substring(1,word.length()-1));
        }else if(f_Letter){
            //if first  is x Or X, print word without them
            System.out.println(word.substring(1));
        }else if(l_Letter){
            //if last letter is x or X print without them
            System.out.println(word.substring(0,word.length()-1));
        }else{//if not x or X print the word
            System.out.println(word);
        }
    }
}
