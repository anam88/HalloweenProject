package replitPractice;

import java.util.Scanner;

public class BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String in = s.next();
        //your code here
        float meal = 10.0f;
        float soda = 2.0f;

/*
if a user enter burger or chicken print the price of burger or chicken which is 10.0
if a user enter soda print the price of soda which is 2.0
 */
        if(in.equalsIgnoreCase("burger") || in.equalsIgnoreCase("chicken")){
            System.out.println(meal);
        }else if(in.equalsIgnoreCase("soda")){
            System.out.println(soda);
        }


    }
}
