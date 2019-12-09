//Author: Aman Gupta
package arrays;

import java.util.*;

public class Arrays_practice {
    public static void main(String[] args) {
        // int[] Dailytemp = new int[7];
        // for (int i = 1; i <= 7; i++) {
        //     printDay(Dailytemp, i);
        // }
        // int average = printAverage(Dailytemp);
        // printHigher(Dailytemp, average);
        // PrintArrays(Dailytemp);
        // highest(Dailytemp);
        // lowest(Dailytemp);
        // rotation(Dailytemp);


        
    }
    
    // public static void printDay(int[] Dailytemp, int dayNum) {
    //     System.out.print("Day" + dayNum + "'s high temp: ");
    //     Scanner temperature = new Scanner(System.in);
    //     int tempp = temperature.nextInt();

    //     Dailytemp[dayNum - 1] = tempp;
    // }

    public static int printAverage(int[] Dailytemp) {

        int avg = 0;
        for (int x = 0; x < Dailytemp.length; x++) {
            avg = avg + Dailytemp[x];
        }
        avg = avg / Dailytemp.length;
        System.out.println("Average temp = " + avg);
        return avg;
    }

    // public static void printHigher(int[] Dailytemp, int avg) {
    //     int AboveAvgCount = 0;
    //     for (int y = 0; y <= 6; y++) {
    //         if (Dailytemp[y] > avg) {
    //             AboveAvgCount++;
    //         }
    //     }
    //     System.out.println(AboveAvgCount + " days were above average");
    // }

    // public static void highest(int[] Dailytemp) {
    //     int HighNum = 0;
    //     int highestindex = 0;
    //     for (int i = 0; i < Dailytemp.length; i++) {
    //         if (Dailytemp[i] > HighNum) {
    //             HighNum = Dailytemp[i];
    //             highestindex = i;
    //         }
    //     }
    //     int ndHighNum = 0;
    //     for (int x = 0; x < Dailytemp.length; x++) {
    //         if (x == highestindex) {
    //             continue;
    //         }
    //         if (Dailytemp[x] > ndHighNum) {
    //             ndHighNum = Dailytemp[x];
    //         }
    //     }
    //     System.out.println("Hottest day = " + HighNum + "," + ndHighNum);

    // }

    // public static void lowest(int[] Dailytemp) {
    //     int coldest = 100;
    //     int coldestindex = 0;
    //     int ndcoldest = 100;
    //     for (int i = 0; i < Dailytemp.length; i++) {
    //         if (Dailytemp[i] < coldest) {
    //             coldest = Dailytemp[i];
    //             coldestindex = i;
    //         }

    //     }
    //     for (int x = 0; x < Dailytemp.length; x++) {
    //         if (x == coldestindex) {
    //             continue;
    //         }
    //         if (Dailytemp[x] < ndcoldest) {
    //             ndcoldest = Dailytemp[x];
    //         }
    //     }
    //     System.out.println("Coldest Days: " + coldest + ", " + ndcoldest);
    // }

    // public static void PrintArrays(int[] Dailytemp) {
    //     System.out.print("Temperatures: [");
    //     for (int i = 0; i < Dailytemp.length; i++) {
    //         System.out.print(Dailytemp[i]);
    //         if (i < Dailytemp.length - 1) {
    //             System.out.print(", ");

    //         }
    //     }
    //     System.out.println("]");
    // }
    // public static void rotation(int[] Dailytemp){
    //     System.out.println("Rotated Arrays: ");
    //     int original1 = Dailytemp[0];
    //     for(int i = 0; i < Dailytemp.length; i++){
    //         if(i == 6){
    //             Dailytemp[i] = original1;
    //             System.out.print(Dailytemp[i]);
    //             continue;
    //         }
    //         Dailytemp[i] = Dailytemp[i+1];
    //         System.out.print(Dailytemp[i] + ",");
    //     }
    //     int lastnumber = Dailytemp[6];
    //     for(int x = Dailytemp.length-1; x >= 0; x-- ){
    //         if(x == 0){
    //             Dailytemp[0] = lastnumber;
                
    //         }else {
    //         Dailytemp[x] = Dailytemp[x - 1];
    //         }
            
    //     }
    //     System.out.println("Rotation: ");
    //     for(int y = 0; y < Dailytemp.length; y++){
    //         System.out.print(Dailytemp[y] + " ");
    //     }
    // }

//quesion #14
    public static boolean contans(int [] x, int[] y){
        boolean a = false; 

        for(int i = 1; i < y.length; i++){

            a = true;

            for(int b = 1; b < y.length; b++){
                
                if (x[i + b] != y[b]){
                    a = false;
                    return false;
                }
            }
            if (a){
                System.out.println(i);
                return true;
            }
        }
        return false;
    }

// question #19

    public static int[] aaaa(int [] [] a, int [] [] ab){
        for(int x = 1; x < a.length; x++){
            
            a[x][x] = ab.length; 

        }
        return a[][]; 
    }

// question #20
    public static boolean magic(int[][] arrays){
        
        if(arrays.length == 0){
            return true;
        }

        int s = 0; 
        int lgth = arrays[0].length; 


        for(int x = 0; x < arrays[0].length; x++){
            s += arrays[0][x];
            
            for(int a = 1; a < arrays.length; a++){
                if(arrays[a].length != lgth){
                    return false;
                }
            int rs = 0;

            }
            int d = 0; 

            if (d != arrays.length){
                return false; 
            }
        }
        return d; 
    }
}
