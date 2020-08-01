package replitPractice;
import java.util.Scanner;
public class SchoolGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Write the program that will calculate average grade.
        Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
        Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;
        -build summary variable by concatenating subject names and grades
        calculate average score and define that value into average variable.
        OUTPUT: -Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
        -Display prompt: "Your average score is: 4.36"
        -Display prompt: "Thank you for using Grader!"
        -Display prompt: "Goodbye!"

        -Create a Scanner object named scan.
         */
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = input.next();
        double grade1 = input.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = input.next();
        double grade2 = input.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = input.next();
        double grade3 = input.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = input.next();
        double grade4 = input.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = input.next();
        double grade5 = input.nextDouble();

        String summary = (subject1+" - "+grade1+", "+subject2+" - "+grade2+", "
        +subject3+" - "+grade3+", "+subject4+" - "+grade4+", "+subject5+" - "+grade5);
        Double average = (grade1 + grade2 + grade3 + grade4 + grade5)/5;

        System.out.println("Summary: "+summary+"\nYour average score is: "+average+
                "\nThank you for using Grader!"+"\nGoodbye!");


    }
}
