// sum of given array

// package Practice_Arrays;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 1};
        int sum = 0;
    
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];  //17
        }
        System.out.println(sum);
    } 
}