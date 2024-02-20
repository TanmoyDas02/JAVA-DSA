// sum of given array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,3,6,2,8,4}; //8
        int ans = 0;
    
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("Max: " + ans);
    }
    
}