package replitPractice;

public class LoopsEvenFrom80to20 {
    public static void main(String[] args) {
        /*
        Write a while loop that prints all
        the even integers from 80 through 20 inclusive, separated by spaces.
         */

        int i = 80; // i = 80
        while(i >= 20){// i is greater than & equal to 20, if this is true than go to if statement
            if(i % 2 == 0){//if the reminder is 0
            }
            System.out.print(i+" ");//print i with the decrement of 2
            i-=2;
        }


    }
}
