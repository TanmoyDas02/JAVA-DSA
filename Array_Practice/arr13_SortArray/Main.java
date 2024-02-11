// Sort an array consisting of 0s and 1s
//
// Enter array size 10
// Enter 10 elements
// 0 1 0 1 0 1 0 1 0 1
// Original array: 0 1 0 1 0 1 0 1 0 1 
// Sorted array: 0 0 0 0 0 1 1 1 1 1





import java.util.Scanner;

public class Main {

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

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0;
        // count number of zeroes
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        // 0 to zeroes-1 : 0, zeroes to n-1 : 1
        for(int i = 0; i < n; i++){
            if(i < zeroes){
                arr[i] = 0;
            } else {
                arr[i] = 1;
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
        sortZeroesAndOnes(arr);
        System.out.print("Sorted array: ");
        printArr(arr);
    }
    
}
