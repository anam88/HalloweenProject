package replitPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int d = 0;
        for (int i= inhabitants; i>=0; i--){

            int [] arr = {inhabitants};
            if (inhabitants==0){
                System.out.println("---- EXTINCT ----");
                break;
            }
            System.out.println("Day "+d+" "+ Arrays.toString(arr));
            d++;
            inhabitants/=2;

        }

    }
}
