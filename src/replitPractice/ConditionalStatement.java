package replitPractice;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String name = inp.nextLine();

        String name1 = (name.equals("Chen")) ? "teacher" : "student";
        System.out.println(name1);
    }
}
