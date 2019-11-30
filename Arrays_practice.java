//Author: Aman Gupta
package arrays;

import java.util.*;

public class Arrays_practice {
    public static void main(String[] args) {

        System.out.println("\n\n");

        int[] numbers = {4, 2, 9, 13, 1};
        numbers[numbers.length-1] = numbers[0];
        // so i need to find the length of the array
        // then i gotta take the firstnumber and 
        for(int i = 0; i < numbers.length-1; i++ ){
            numbers[i] = numbers[i + 1];
            
        }
        
        System.out.println(Arrays.toString(numbers));
        
    }
}
