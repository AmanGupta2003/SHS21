package test3;

import java.util.*;


public class Test3 {
    public static void main(final String[] args) {

       
    }
// question 1
    public static int FinalIndex(int [] data, int var){
        int occ = -1; 

        for(int x = 0; x < data.length; x++ ){
            if{data[x] == var}{
                occ = x;
            }
        }
        return occ;
    }

// question 2
    public static int something( int [] data){
        int var; 

        Arrays.sort(input);

        var = input[data.length] - data[0] + 1; 
        return var;
    }

// question 3
    public static int range(int[] data, int y, int z){
        
        int whatever;
        whatever = 0; 
        
        for(int x= 0; x < data.length; x++){
            if( y <= data[x] && data[x] <= z){
                whatever++;
            }
        }
        
        
        return whatever;
    }

// question 5
    public static int mode(int[] data){
        int m = 0; 

        int{} tallyit = new int[100];

        for(int x = 0; x < tallyit.length; x++){
            if(tallyit[x] > tallyit[m]){
                m = x; 
            }
        }
        return m;
    }

// question 8
    public static double median(int [] data){
        Arrays.sort(data); 

        if(data.length % 2 != 0){
            
            return data[data.length / 2];
        }else 
        {
            return (data); 
        }

    }
// question 10

    public static boolean sorted(double [] data){
        boolean s = true; 

        double lastnumber = -99999999; 

        for(int x = 0; x< data.length; x++){
            if(lastnumber <= data[x]){
                lastnumber = data[x]; 

            } else
                {
                    s = false; 
                }
        }
        return s; 
    }


    // HOMEWORK FOR DAY 2

// question 11

public static boolen unique(int [] data){
    boolean u = true; 

    for(int x;){
        for(int i = x; i < data.length; i++){
            if(x == data[x]){
                u = false;
            }
        }
    }
    return u;
}

// question 12 sorry i dont understand this question 
//properly, i dont know how to solve it

// question 13

public static int sequence(int [] data){
    if(data.length == 0){
        return 0; 
    }

    int length = 1; 
    
    int length2 = 1;
    
    for(int x = 1; x< data.length; x++){
        if(data[x-1] <= data[x]){
            length2++; 
        } else{
            if(length2 > length){
                length = length2;
            }
            length2 = 1;
        }
    }
    return Math.max(length);
}


}