package replitPractice;

import java.util.Scanner;

public class Parse102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

        if (html.contains("<html>")){
            System.out.println(html.substring(html.indexOf("id=\"")+4,html.lastIndexOf("\"")));
        }else{
            System.out.println("Invalid input!");
        }



    }
}
