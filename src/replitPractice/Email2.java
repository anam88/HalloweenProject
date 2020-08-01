package replitPractice;

import java.util.Locale;
import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        /*
Write a program that will print out information about user based on email.
Print first and last name from the upper case.
Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the email address: ");
        String email = scan.next();
//underscore index
        int underScore = email.indexOf("_");
//@ index
        int domainIndex1 = email.indexOf("@");
//. index
        int domainIndex2 = email.lastIndexOf(".");
//first name
        String f_name = email.substring(0,1).toUpperCase() +email.substring(1,underScore);
//last name
        String l_name = email.substring(underScore +1,domainIndex1);
        l_name = l_name.substring(0,1).toUpperCase() + l_name.substring(1);

            //    .toUpperCase()+ email.substring(underScore+1,domainIndex1) ;
//domain
        String domain = email.substring(domainIndex1+1, domainIndex2);
//Top-Level Domain:
//        int length = email.length()-1;
       String topLevelDomain = email.substring(domainIndex2+1);
//
       System.out.println("First name: "+f_name);
       System.out.println("Last name: "+l_name);
       System.out.println("Domain: "+domain);
       System.out.println("Top-Level Domain: "+topLevelDomain);





    }
}
