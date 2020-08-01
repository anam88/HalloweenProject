package replitPractice;

import java.util.Scanner;

public class EmailSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
//If email contains no @ character or multiple @ characters then print invalid email:
//if email contains @ than
        /*
email -> info@cybertekschool.com
Print:
Email id: info
Email domain: cybertekschool.com
         */
      //  int atSign = email.indexOf('@');
   //     System.out.println(atSign);
        if (email.indexOf('@') == -1 || email.indexOf('@') == 2) {
            System.out.println("invalid email");
        }else {
            String words[] = email.split("@");
            System.out.println("Email id: " + words[0]);
            System.out.println("Email domain: " + words[1]);

        }

    }
}
