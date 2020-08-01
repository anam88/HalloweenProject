package replitPractice;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        System.out.println("Enter price in cents:");
        int itemPrice = input.nextInt();
        int change = 100-itemPrice;
        if(itemPrice<=100&&itemPrice>=25&&itemPrice%5==0){
            quarters = change/25;
            dimes = change%25/10;
            nickels = change%25%10/5;
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
        }else{
            System.out.println("Invalid price!");
        }



    }
}
