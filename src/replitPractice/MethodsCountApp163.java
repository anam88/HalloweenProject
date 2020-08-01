package replitPractice;

public class MethodsCountApp163 {
 /*
Create a method that gets an array of strings and a string, the method returns an int.

It counts how many times a string appears in the array and returns the count.
  */

/*
1. first we create a method that return us int
2. parameters are String[]arr, and String
3. now we need to know the frequency to we gave a variable count and assign it to zero
4. now we give for each loop to iterate through all the elemnents in string arr
5. than we give if statement to compare elements in array with the given string
6. if the array as appeared twice than add it to count and print count
 */

    public static int count_appearance(String[] arr, String t){
        int count = 0;
        for(String each : arr){
            if(each == t){
                count++;
            }
        }

        return count;
    }
}
