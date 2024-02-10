// problem: Rotate the given array 'a' by k steps, where k is non-negative.
// Note- k can be greater than n as well.
//
// Output
// Enter array size: 5
// Enter 5 elements
// 1 2 3 4 5
// Enter k: 
// 2
// Original Array
// 1 2 3 4 5
// Array after rotation
// 4 5 1 2 3




import java.util.Scanner;

public class Main {

    // print the array
    static void printArr(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // without taking extra memory part
    static void swapArray(int[] arr, int st, int end){
        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] arr, int st, int end){
        while(st < end){
            swapArray(arr, st, end);
            st++;
            end--;
        }
    }

    //main code for without taking extra memory
    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n; // it help us when we put big no to rotate the array
        
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }


    // taking extra memory part
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n; // it help us when we put big no to rotate the array
        
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }

        for(int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original Array");
        printArr(arr);
        rotateInPlace(arr, k);
        // int[] ans = rotate(arr, k);
        System.out.println("Array after rotation");
        printArr(arr);
    }
}