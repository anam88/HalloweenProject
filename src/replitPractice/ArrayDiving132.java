package replitPractice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayDiving132 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float sum=0;
        for (int i=0;i<7;i++){
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i]=input.nextFloat();
            sum+=score[i];
        }
        System.out.println("Enter difficulty:");
        float dif=input.nextFloat();
        //System.out.println(Arrays.toString(score));
        Arrays.sort(score);
        sum= sum-score[0]-score[6];
        float total=(sum*dif)*60/100;

        System.out.printf("Total: %.2f", total);
    }
}
