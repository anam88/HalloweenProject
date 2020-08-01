package replitPractice;
import java.util.Scanner;
public class Arrays121CountEvens {
    public static void main(String[] args) {
/*
Given an array nums,
calculate count of even numbers in nums (not their values!)
 and print out to console.

 */
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

    //TODO: Write your code below
        int countEven = 0;
        for(int each : nums){
            if(each % 2 != 0){
                continue;
            }
            countEven++;
        }
        System.out.println(countEven);



    }

}
