package replitPractice;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //write your code below
        int maxLength = words[0].length();

        for (String each : words) {
            int len = each.length();
            if (len > maxLength) {
                maxLength = len;
            }
        }
        for (String each : words) {
            if (each.length() == maxLength) {
                System.out.println(each);
            }


        }
    }
}