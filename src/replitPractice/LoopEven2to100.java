package replitPractice;

public class LoopEven2to100 {
    public static void main(String[] args) {
/*        Write a program that will print out even numbers from 2 to 100 through the comma. */

        int n = 2;
        while(n <= 100){
            if(n % 2 ==0){
            }
            System.out.print(n+" , ");//print i with the decrement of 2
            n+=2;
        }
        System.out.println();
/*
Write a  for loop that prints the odd integers 11 through 121 inclusive, separated by spaces.
 */
        for(int i = 11; i <= 121; i +=2){
            if(i % 3 == 0){
            }
            System.out.print(i+" ");
        }

    }
}
