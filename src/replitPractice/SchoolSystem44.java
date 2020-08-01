package replitPractice;

import java.util.Scanner;

public class SchoolSystem44 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
        String status = "";

        if(age < 2 ){
            status = "ineligible";
        }else if(age == 2){
            status = "toddler";
        }else if(age >= 3 && age <= 5){
            status = "early childhood";
        }else if(age >= 6 && age <=7){
            status = "young reader";
        }else if (age >= 8 && age <=10){
            status = "elementary";
        }else if (age >=11 && age <= 12){
            status = "middle";
        }else if (age == 13){
            status = "impossible";
        }else if (age >= 14 && age <=16){
            status = "high school";
        }else if (age >=17 && age <=18){
            status = "scholar";
        }else{
            status = "ineligible";
        }
        System.out.println(status);
    }
}