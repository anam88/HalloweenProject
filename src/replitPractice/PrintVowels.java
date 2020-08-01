package replitPractice;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
/*
Write a for loop that will loop
through every letter of the input and print out just the vowels.
 */
        Scanner inp = new Scanner(System.in);
        System.out.print("In: ");
        String word = inp.nextLine();

        String result = "";
        for(int i = 0; i <= word.length()-1; i++){
            char ch = word.charAt(i);
            String add = ""+ch;

            if(add.contains("a") || add.contains("e")|| add.contains("i")
            || add.contains("o")|| add.contains("u")){
                result += add;
            }else{
                continue;
            }
        }
        System.out.println(result);


    }
}
