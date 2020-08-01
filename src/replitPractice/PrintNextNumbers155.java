package replitPractice;

import java.util.Scanner;

public class PrintNextNumbers155 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }
    public static void  next3(int num){
    
        for(int i = num+1; i < num+4; i++){
            System.out.print((i+" "));
        }
    }

}
