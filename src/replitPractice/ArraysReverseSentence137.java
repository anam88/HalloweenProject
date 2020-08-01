package replitPractice;

import java.util.Scanner;

public class ArraysReverseSentence137 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
//sentence: "Java is fun"
        //type your code below
        String[] words = sentence.split(" ");
//loop to print the string on separate line
        for(int i = words.length-1; i >= 0; i--){
            String word = words[i];
                System.out.println(word);
            }



    }
}
