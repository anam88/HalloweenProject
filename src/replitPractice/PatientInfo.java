package replitPractice;

import java.net.Socket;
import java.util.Scanner;
/*
Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables:workPhoneNumber and personalPhoneNumber.
OUTPUT: Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true

 */
public class PatientInfo {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String f_name = scan.next();
        System.out.println("Enter your last name");
        String l_name = scan.next();


        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean marriedStatus = scan.nextBoolean();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        String fullName = ("Full name: "+l_name+", "+f_name);
        String address = ("Address: "+street+", "+city+", "+state+" "+zipCode);
        String contacts = ("Contacts: "+" work phone number - "+workPhoneNumber+","+
                "personal phone number - "+personalPhoneNumber+", "+"email: "+email);

        System.out.println("Patient personal information"+"\n"+fullName+"\n"+address+"\n"+contacts+
                "\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds"+"\nMarried?: "+marriedStatus);



    }

}
