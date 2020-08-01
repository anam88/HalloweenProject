package replitPractice;

import java.util.Scanner;

public class FindMiddleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();
        //1 , 6 , 9

        if(num1 > num2 && num2 > num3 || num3 > num2 && num2 > num1){
        //    true && false //F       ||   true && true  //one statement has to be true
            System.out.println("the medium value is: "+num2);
        }else if(num1 > num3 && num3 > num2 || num2 > num3 && num3 > num1){
        //    false && True                ||  false && true // true
            System.out.println("the medium value is: "+num3);
        }else{
            System.out.println("the medium value is: "+num1);
        }

    }
}
