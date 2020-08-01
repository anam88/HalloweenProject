package replitPractice;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = input.nextInt();

        int candyBar = coupons/10;//10 coupons == 1 candy bar
        int gumball = (coupons%10)/3; //3 coupons == 1 gumball

        if (coupons>=3){
            System.out.println("Number of Candies: "+ candyBar);
            System.out.println("Number of Gumballs: "+gumball);
        }else{
            System.out.println("Not enough coupons");
        }

    }
}
