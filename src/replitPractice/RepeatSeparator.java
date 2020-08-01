package replitPractice;
import java.util.Scanner;
public class RepeatSeparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt(); //number of times word occur
/*
Given two strings, word and a separator sep,
return a big string made of count occurrences of the word,
separated by the separator string.
Example:
input: Word
input: X
input: 3
output: WordXWordXWord
 */

        String result = "";
        for(int i = 0; i < count; i++){
            if(i < count -1){
                result += word +separator;
            }else{
                result += word;
            }
        }
        System.out.println(result);
    }

}
