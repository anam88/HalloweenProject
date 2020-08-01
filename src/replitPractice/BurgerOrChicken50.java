package replitPractice;

import java.util.Scanner;

public class BurgerOrChicken50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        float meal = 10.0f;
        float soda = 2.0f;

        if(in.equalsIgnoreCase("burger")|| in.equalsIgnoreCase("chicken")){
            System.out.println(meal);
        }
        if(in.equalsIgnoreCase("soda")){
            System.out.println(soda);
        }




    }
}
