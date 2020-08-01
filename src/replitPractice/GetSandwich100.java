package replitPractice;

import java.util.Scanner;
/*
print out a string between the word bread, if nothing between word bread than print nothing
 */
public class GetSandwich100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0;
     //bread is a 5 letter word so in order
        for(int i=0; i < str.length()-4; i++){
            if (str.substring(i,i+5).equalsIgnoreCase("bread")){
                count++;
            }
        }
        if (count>=2){
            System.out.println(str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread")));
        }else{
            System.out.println("nothing");
        }



    }
}
