package replitPractice;
import java.util.Scanner;
public class ShortestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        int minLength = str[0].length();

        for(String each : str){
            int len = each.length();
            if(len < minLength){
                minLength = len;
            }
        }
        for(String each : str){
            if(each.length() == minLength){
                System.out.println(each);
            }
        }
    }
}
