package replitPractice;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an item");
        String item = input.nextLine();
        if (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 85$");
        } else if (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 90$");
        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 70$");
        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 50$");
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 75$");
        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 95$");
        } else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 40$");
        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 60$");
        } else {
            System.out.println("Invalid item!");


        }
    }
}
