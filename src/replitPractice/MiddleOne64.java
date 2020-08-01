package replitPractice;
import java.util.Scanner;
public class MiddleOne64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //if word has odd number of character and 3 or more character, print middle number
        int midIndex = (word.length()-1 ) / 2; //will give us middle index
        char midChar = word.charAt(midIndex);//will give us the middle char
        boolean oddNum = (word.length()) % 2 != 0;
        boolean threeOrMore = (word.length()) >= 3;

        //if word has odd number of character and 3 or more character, print that character 3 times
        boolean singleCharacter = (word.length()) == 1;

        //if word has even number of character and 4 or more character, print middle number
        boolean evenNum= (word.length()) % 2 == 0;
        boolean fourOrMore = (word.length()) >= 4;

        //if word has 2 character, print those 2 character twice
        boolean twiceCharacter = (word.length()) == 2;
          if(oddNum == true && threeOrMore == true){
              System.out.println(word.charAt(midIndex));
          }else if(singleCharacter == true){
              System.out.println("" +word.charAt(0) + word.charAt(0) + word.charAt(0));
          }else if(evenNum == true && fourOrMore == true){
              System.out.println("" +word.charAt(midIndex)+ word.charAt(midIndex+1));
          }else if(twiceCharacter == true){
              System.out.println("" +word.charAt(0) + word.charAt(1) + word.charAt(0) + word.charAt(1));
          }

 //       System.out.println(midIndex);
  //      System.out.println(midChar);

    }
}
