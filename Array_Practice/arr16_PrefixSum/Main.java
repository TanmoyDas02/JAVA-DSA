// Problem:- Given an integer array 'a', return the prefix sum/running sum in the 
//           same array without creating a new array.
// 
// Output-
// Enter array size 5
// Enter 5 elements
// 2 1 3 4 5
// Input Array     
// 2 1 3 4 5       
// Prefix Sum Array
// 2 3 6 10 15

import java.util.Scanner;

public class Main {

    // print the array
    static void printArray(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // using new array
    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0]; // cause 1st value will be same as actual array 1st value

        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    // without making new array
    static int[] makePrefixSumArrayWithoutCreateArray(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        System.out.println("Prefix Sum Array");
        // int[] pref = makePrefixSumArray(arr);
        int[] pref = makePrefixSumArrayWithoutCreateArray(arr);
        printArray(pref);
    }
}