//Author: Aman Gupta
package arrays;

import java.util.*;

public class Arrays_practice {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int b = keyboard.nextInt();
        idk(b);
    }

    public static int idk(int number) {
        int[] numbers = new int[12];

        while (numbers > 0) {
            int abcd = number % 10; 
            numbers[abcd]++;
            number = number/10;
        }

        int idkk = 0;
            for (int x = 1; x < numbers.length(); x++ ){
                if(numbers[x] > numbers[idkk]){
                    idkk = x;
                }
            }
            return idkk;
    }
}
