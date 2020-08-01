package replitPractice;

public class LoopDivby3 {
    public static void main(String[] args) {
        /*
        Write for and while loops so that they print those numbers between 1 and 20
        and divisible by 3.
Expected Output:  3 6 9 12 15 18
         */

        for(int i = 1; i <= 20; i++) {//prints 1 to 20
            while(i % 3 == 0){//if i is divisible by 3
                System.out.print(i+" ");//print 1
                i++;//increase by 1
            }

        }


    }
}
