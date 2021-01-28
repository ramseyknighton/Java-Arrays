package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //1. Finding the Sum:
        int array1[] = {1, 2, 3, 4, 6, 6, 6, 7, 8};
        int sum = 0;
        for (int num : array1) {
            sum = sum + num;
        }
        System.out.println(sum);

        //2. This will print out 2
        double[] exampleArray = {1,5,6,5,4,1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i<exampleArray.length; i++){
            if (exampleArray[ i ] > maximum) {
                maximum = exampleArray[ i ];
                index = i;
            }
        }
        System.out.println(index);

        toPower(4,2);

    }

    //3. toPower Method
    public static void toPower(int size,int power){
//        size = 4;
//        power = 2;

        Integer powerArray[]= new Integer[size];
        for(int i =0; i <size; i++) {
            powerArray[i] = (int) Math.pow(i,power);
        }
        System.out.println(Arrays.toString(powerArray));

    }
}
