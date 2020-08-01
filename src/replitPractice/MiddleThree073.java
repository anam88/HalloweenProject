package replitPractice;
import java.util.Scanner;
public class MiddleThree073 {
    public static void main(String[] args) {
        /*
Instructions from your teacher: You have a word, do the following:
If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.
Otherwise print "invalid".
for example: fifteen ==> fte | java ==> invalid
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = scan.next();
        //YOUR CODE HERE
        int midIndex = (word.length()-1 ) / 2; //will give us middle index
        char midChar = word.charAt(midIndex);//will give us the middle char
        boolean oddNumber = (word.length()) % 2 != 0;
        boolean fiveOrMore = (word.length()) >= 5;
        //if word is Apple
        //mid index will give 2
        //mid char will give p
        //midindex + 1 will be l
        //midindex -1 will be p
        //output: ppl

        if(oddNumber == true && fiveOrMore == true){
            System.out.println(""+word.charAt(midIndex-1)+word.charAt(midIndex)+word.charAt(midIndex+1));
        }else{
            System.out.println("Invalid");
        }

//        System.out.println(midIndex);
//        System.out.println(midChar);


    }
}
