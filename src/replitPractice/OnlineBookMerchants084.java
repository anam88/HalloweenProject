package replitPractice;
import java.util.Scanner;

public class OnlineBookMerchants084 {

    public static void main(String[] args) {
        /*
Online Book Merchants offers
    premium customers
        1 free book with every purchase of 5 or more books
        and offers 2 free books with every purchase of 8 or more books.


    Regular customers
        1 free book with every purchase of 7 or more books,
        and offers 2 free books with every purchase of 12 or more books.

 Write a program that assigns freeBooks the appropriate value based on the values
  of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
   Print amount of freeBooks into the console.

         */
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the customer premium customer?");
        boolean isPremiumCustomer = scan.nextBoolean();
        System.out.println("Enter the number of books purchased");
        int nbooksPurchased = scan.nextInt();

//       if(isPremiumCustomer == true && nbooksPurchased > 4 && nbooksPurchased < 8){
//           freeBooks = 1;
//       }
//       else if(isPremiumCustomer == true && nbooksPurchased > 7){
//           freeBooks = 2;
//       }
//       else if(isPremiumCustomer == false && nbooksPurchased > 6 && nbooksPurchased < 12){
//           freeBooks = 1;
//       }
//       else if(isPremiumCustomer == false && nbooksPurchased > 11){
//           freeBooks = 2;
//       }
//       System.out.println(freeBooks);



        if(isPremiumCustomer){
            if(nbooksPurchased > 4 && nbooksPurchased < 8){
                freeBooks = 1;
            }
            else if(nbooksPurchased > 7){
                freeBooks = 2;
            }
        }else{
            if(nbooksPurchased > 6 && nbooksPurchased < 12){//between 7 - 11
                freeBooks = 1;
            }else if(nbooksPurchased > 11){
                freeBooks = 2;
            }
        }
        System.out.println(freeBooks);

    }
}
