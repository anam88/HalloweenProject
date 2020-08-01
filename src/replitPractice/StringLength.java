package replitPractice;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = s.next();
        int l1 = name.length();
        System.out.println(l1);
    }
}
