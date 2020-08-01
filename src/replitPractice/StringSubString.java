package replitPractice;
import java.util.Scanner;
public class StringSubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        txt = txt.substring(0,2);
        System.out.print(txt);

    }
}

