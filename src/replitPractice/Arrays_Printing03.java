package replitPractice;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Printing03 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
 /*
 Example:
arr -> ["apple", "banana","kiwi", "grape","milk","soda"]
 prints:  apple , banana , kiwi
          banana , kiwi , grape
          kiwi , grape , milk
          grape , milk , soda
  */
        for(int i = 0; i <= 3; i++){
        System.out.println(arr[i]+" "+arr[i+1]+" "+arr[i+2]);
    }


        System.out.println(Arrays.toString(arr));


    }
}

