package replitPractice;

import java.util.Scanner;

public class TernaryOperator61 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = input.nextInt();
        System.out.println("Enter number2:");
        int num2 = input.nextInt();

        int result = (num1 > num2) ? num1 : num2;
        System.out.println(result);
    }
}
