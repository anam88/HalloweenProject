package replitPractice;

import java.util.Scanner;

public class MergeThem66 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        boolean length = word1.length() == 3 && word2.length() == 3 ;
        String merge = word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""
                +word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2);

        if(length == true){
            System.out.println(merge);
        }else{
            System.out.println("cannot merge");
        }

    }
}
