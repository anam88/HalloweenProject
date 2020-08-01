package replitPractice;

import java.util.Scanner;

public class WeekDays57 {
   /*
   Write a program that will print a week days according to the day number. Use  Switch statement.
   Display message: "Enter number:"
    1
   Display message: "Monday"
    */
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter number:");
       int day = scan.nextInt();
       String message = "";

       switch (day){
           case 1:
               message = "Monday";
               break;
           case 2:
               message = "Tuesday";
               break;
           case 3:
               message = "Wednesday";
               break;
           case 4:
               message = "Thursday";
               break;
           case 5:
               message = "Friday";
               break;
           case 6:
               message = "Saturday";
               break;
           case 7:
               message = "Sunday";
               break;
           default:
               message = "No such day";
               break;
       }
       System.out.println(message);
   }

}