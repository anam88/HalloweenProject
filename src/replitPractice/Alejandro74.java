package replitPractice;

import java.util.Scanner;

public class Alejandro74 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
//if the email contains word alejandro and project print read this email else dont read
        boolean theEmail = a.contains("alejandro") && a.contains("project");
        if (theEmail == true) {
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }
    }
}
