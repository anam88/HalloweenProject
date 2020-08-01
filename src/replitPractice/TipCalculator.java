package replitPractice;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Split");
        String split = input.next();
        System.out.println("Number of people:");
        int numOfPeople = input.nextInt();
        System.out.println("Check amount:");
        double chkAmount = input.nextDouble();
        System.out.println("Service Quality:");
        String service = input.next();
        double totalPay = 0;
        double totalTip = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;
        String add = "";

        for(int i =0; i < numOfPeople;i++){
            add+="&";

        }
        System.out.println("Number of people entered: " +add );

        if(split.equalsIgnoreCase("yes")){
            if(numOfPeople > 1 && service.equalsIgnoreCase("Excellent")){
                totalTip += chkAmount * 0.25;
                tipPerPerson += totalTip / numOfPeople;
                totalPerPerson += totalTip + tipPerPerson;
                totalPay += chkAmount + totalTip;
            }else if(numOfPeople > 1 && service.equalsIgnoreCase("Great")){
                totalTip += chkAmount * 0.20;
                tipPerPerson += totalTip / numOfPeople;
                totalPerPerson += totalTip + tipPerPerson;
                totalPay += chkAmount + totalTip;
            }else if(numOfPeople > 1 && service.equalsIgnoreCase("Good")){
                totalTip += chkAmount * 0.15;
                tipPerPerson += totalTip / numOfPeople;
                totalPerPerson += totalTip + tipPerPerson;
                totalPay += chkAmount + totalTip;
            }else if(numOfPeople > 1 && service.equalsIgnoreCase("Fair")){
                totalTip += chkAmount * 0.10;
                tipPerPerson += totalTip / numOfPeople;
                totalPerPerson += totalTip + tipPerPerson;
                totalPay += chkAmount + totalTip;
            }else if(numOfPeople > 1 && service.equalsIgnoreCase("Poor")){
                totalTip += chkAmount * 0.5;
                tipPerPerson += totalTip / numOfPeople;
                totalPerPerson += totalTip + tipPerPerson;
                totalPay += chkAmount + totalTip;
            }
        }else{
            System.out.println("Invalid data");
        }

        System.out.println("Total to pay: "+totalPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);


    }
}
