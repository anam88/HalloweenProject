package replitPractice;

import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class Email1076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the email address: ");
        String email = scan.next();
    /*
In this task, you need to swap first name with last name in the email.
If email doesn't contains underscore - do not anything.
Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
     */

        int underScore = email.indexOf("_");
        int atSign = email.indexOf("@");

        if(email.contains("_")){
            String f_name = email.substring(0,underScore);
            String l_name = email.substring(underScore+1,atSign);
            System.out.println(l_name + "_" + f_name + email.substring(email.indexOf("@")));
        }else{
            System.out.println(email);
        }








    }
}
