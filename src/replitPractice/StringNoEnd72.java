package replitPractice;

import java.util.Scanner;

public class StringNoEnd72 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

       txt = txt.substring(0, txt.length()-1);
        System.out.println(txt);
    }
}
