package replitPractice;

import java.util.Scanner;

public class HasAJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String word1 = word.substring(1);

        if(word.startsWith("java")){
            System.out.println(true);
        }else if(word1.startsWith("java")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }


    }
}
