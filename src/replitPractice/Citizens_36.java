package replitPractice;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Citizens_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = input.nextInt();
        int nonSeniorCitizens = input.nextInt();
        System.out.println("What is new citizen's age?");
        int age = input.nextInt();

        String message = "";
        if(age >= 65){
            message = "Senior Citizen";
            seniorCitizens++;
        }else{
            message = "Non-Senior Citizen";
            nonSeniorCitizens++;
        }
        System.out.println(message);
        System.out.println("New seniorCitizens count "+seniorCitizens+"\nNew nonSeniorCitizens count "+
                nonSeniorCitizens);
    }
}
