// Given an array 'a' consisting of integers. Return the first value that is 
// repeating in this array, If no value is being repeated, return -1.
//
// Enter array size 
// 5
// Enter 5 elements
// 1 2 3 2 3
// First repeating element: 2




import java.util.Scanner;

public class Main {

    static int firstRepeatingNumber(int[] arr){
        for(int i = 0; i < arr.length; i++){ //first number
            for(int j = i+1; j < arr.length; j++){ //second number
                if(arr[i] == arr[j]){
                    return arr[i]; //found number
                }
            }
        }
        return -1; // if number not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("First repeating element: " + firstRepeatingNumber(arr));  
    }
}