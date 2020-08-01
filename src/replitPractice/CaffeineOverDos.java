package replitPractice;

import java.util.Scanner;
/*
Write a program with a variable that holds the number of milligrams of caffeine in a drink
and outputs how many drinks it takes to kill a person. In one gram, there is 1000 mg.
 */

public class CaffeineOverDos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of milligrams in a drink:");
        int milligrams = input.nextInt();
        int gram = 1000; // in one gram there is 1000 mg
        int Overdose = 10  * gram;
        int caffeineCount = Overdose / milligrams;

        System.out.println("It would take about "+caffeineCount+" drinks for a lethal overdose.");

    }

}
