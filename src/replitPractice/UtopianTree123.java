package replitPractice;

public class UtopianTree123 {
    public static void main(String[] args) {
/*  The Utopian Tree grows exactly 1 cm for the first three years,
and after that it grows by 2 cm every year,
this is a simple implementation of the algorithm. You will need to use loops to create it.
Show 10 years of growth of the Utopian Tree.

*/

        int  year = 0;
        int treeSize = 0;
        for (int i = 1; i <=10 ; i++){
            if(i <= 3 ){//i is less than equal to 3 it grows 1 cm
                System.out.println("year "+ i + " - growth 1 cm");
                treeSize++;// add 1
            }else if(i > 3){ //greater than 3 grows 2 cm
                System.out.println("year "+ i + " - growth 2 cm");
                treeSize+=2; //add 2
            }
            System.out.println("tree size: " + treeSize +"cm");
        }


    }
}
