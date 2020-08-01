package replitPractice;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String license = scan.next();

        if(license.equalsIgnoreCase("yes")){
            System.out.println("Enter your zip code");
            int zip = scan.nextInt();
            premium = (zip==20910||zip==20740)?premium+60:(zip==22102||zip==22103)?premium+30:premium+50;
            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            vehicleOwnership = scan.next();
            premium =vehicleOwnership.equalsIgnoreCase("owned")?premium+10:premium+20;
            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.next();

            premium = (vehicleUsage.equals("Business"))? premium+50:
                    (vehicleUsage.equals("Pleasure"))?premium+10:premium+20;

            if(vehicleUsage.equals("Commute")){
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += (daysDrivenToWorkOrSchool*5);
                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool;
            }
            System.out.println("How old are you?");
            int age = scan.nextInt();
            if(age<16){
                System.out.println("Invalid data!");
                System.exit(0);
                System.exit(0);
            }else if(age<18){
                premium *= 20;
            }else if(age<=21){
                premium *=6;
            }else if(age<25){
                premium *= 2;
            }
            System.out.println("How many years you've been driving?");
            int experience = scan.nextInt();
            if(experience>0 && (age-experience)>=16){
                premium -= (experience*5);
            }else{
                System.out.println("Invalid data!");
                System.exit(0);
            }
            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents = scan.next();
            if(accidents.equalsIgnoreCase("yes")){
                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                premium += accidentsAmount*(premium*0.2);
            }
            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.next();
            if(continuousInsurance.equalsIgnoreCase("no")){
                premium *= 2;
            }
            scan.nextLine();
            System.out.println("What is the highest level of education you have completed?");
            education = scan.nextLine();
            if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Masters")||
                    education.equalsIgnoreCase("Bachelors")){
                premium -= premium*0.05;
            }else if(education.equalsIgnoreCase("Doctors")){
                premium -= premium*0.10;
            }else if(education.equalsIgnoreCase("less than high school")){
                premium += premium*0.05;
            }
            String referenceNum=(name.substring(0,2)+age+name.substring(name.length()-2)+
                    zip+education).toUpperCase();
            referenceNum = referenceNum.replace(" ","");
            System.out.println(name+", here's your quote!");
            System.out.println("Start Your Policy Today For: $"+premium);
            System.out.println("Reference number: "+referenceNum);

        }else{
            System.out.println("Invalid data!");
            System.exit(0);
        }

    }
}
