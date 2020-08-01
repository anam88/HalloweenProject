package replitPractice;

import java.util.Scanner;

public class FindAUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String name = scan.nextLine();
        boolean findName = name.equalsIgnoreCase("Max Payne")
                || name.equalsIgnoreCase("Alan Wake");

       String userFound = (findName) ? "User found!" : "User not found!";
        System.out.println(userFound);

    }
}
