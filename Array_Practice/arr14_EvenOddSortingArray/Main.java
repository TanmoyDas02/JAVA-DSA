// Given an array of integers 'a', move all the even integers at the beginning 
// of the array followed by all the odd integers. The relative order of odd and 
// even integers does not matter. Return any array that satisfies the condition. 

// Output-
// Enter array size 6
// Enter 6 elements
// 1 2 3 4 5 6
// Original array: 1 2 3 4 5 6 
// Sorted array: 6 2 4 3 5 1




import java.util.Scanner;

public class Main{

    // print the array
    static void printArr(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // swap method
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void sortArrayByEvenOdd(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;

        // if left has odd and right has even then swap
        while(left < right){
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            // if in left has even
            if(arr[left] % 2 == 0){
                left++;
            }

            // if in right has odd
            if(arr[right] % 2 == 1){
                right--;
            }
        }
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

        System.out.print("Original array: ");
        printArr(arr);
        sortArrayByEvenOdd(arr);
        System.out.print("Sorted array: ");
        printArr(arr);
    }
}