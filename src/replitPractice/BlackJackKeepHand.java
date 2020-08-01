package replitPractice;
import java.util.Scanner;
public class BlackJackKeepHand {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
1) if the card total is bigger then 21 the player busts.
2)if the house score is bigger then the player, the player loses .
3)if the player score is equal to the house then theirs a draw.
4)if the player score is bigger then the house the player wins.
player and house scores are represented by  player and house int variables.
check them using ifs to determine the result.

 for example:
player  = 21  house = 8 output: bust
player = 7 house = 10 output: player loses
player = 4 house = 4 output: its a tie
player = 12 house 7 output: player wins
         */
        int house = s.nextInt();
        int player = s.nextInt();
//  1) if the card total is bigger then 21 the player busts.
        boolean cardTotal = player >= 21;
//  2)if the house score is bigger then the player, the player loses .
        boolean houseScore = house > player;

        if(cardTotal == true){
            System.out.println("bust");
        }else if(houseScore == true){
            System.out.println("player loses");
        }else if(player > house){
            System.out.println("player wins");
        }else{
            System.out.println("its a tie");
        }


    }
}
