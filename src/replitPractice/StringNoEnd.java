package replitPractice;
import java.util.Scanner;
public class StringNoEnd {
    public static void main(String[] args) {
        /*
In this exercise you get a string called txt .
output txt without its last letter.
for example:
txt = "foo"
output will be:
fo
*/
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the txt: ");
        String txt = s.next();
        //your code here

        txt = txt.substring(0, txt.length()-1);
        System.out.println(txt);

    }
}
