package replitPractice;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = input.next();
        //Your code starts here
        for (int i = 0; i <=word.length()-3 ; i++) {
            if ("cat".equalsIgnoreCase(word.substring(i,i+3 ))) {
                countOfCats++;
            }
            if ("dog".equalsIgnoreCase(word.substring(i, i+3))) {
                countOfDogs++;
            }
        }
        System.out.println(countOfDogs == countOfCats);


    }
}
