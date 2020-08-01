package replitPractice;
import java.util.Scanner;
public class LoopCalculateSumOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        if(n > 0){//n is greater than 0
            for(int i = 1; i <= n; i++){
        //               1 less than equal to 5, true
                sum += i;
            }
            System.out.println(sum);
        }











    }
}
