package replitPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLast140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),
                input.nextLine(),input.nextLine(),input.nextLine()};
/*
  Given a String array words,
  iterate through each word and print first and last letter of each element
   */
        String[]arr = new String[words.length];
        for(int i = 0; i <= words.length -1; i++){
            arr[i] = (words[i].charAt(0)+""+words[i].charAt(words[i].length()-1));

        }
        System.out.println(Arrays.toString(arr));

    }
}
