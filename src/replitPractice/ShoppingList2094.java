package replitPractice;

import java.util.Scanner;

public class ShoppingList2094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;
        while(count <= 10){
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalProce += price;
            shoppingListReport = shoppingListReport + "Item" + count + ": " + item + " Price: " + price + ", ";
            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equals("yes")){
                count++;
                continue;
            } else {
                System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
                System.out.println("Total price: " + totalProce);
                break;

            }
        }
    }
}
