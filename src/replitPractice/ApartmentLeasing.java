package replitPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ApartmentLeasing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments");
        System.out.println("Number of bedrooms your are interested in:");

        int numberOfBedrooms = input.nextInt();
        int startingPrice = 0;

        String result = "";
        if(numberOfBedrooms == 1){
            result = "One Bedroom Selected";
            startingPrice = 1100;
        }else if(numberOfBedrooms == 2){
            result = "Two Bedroom Selected";
            startingPrice = 1850;
        }else if(numberOfBedrooms == 3){
            result = "Three Bedroom Selected";
            startingPrice = 2550;
        }else{
            result = "No such Bedrooms available";
        }
        System.out.println(result);
        System.out.println("Starting Price: "+startingPrice);


    }
}
