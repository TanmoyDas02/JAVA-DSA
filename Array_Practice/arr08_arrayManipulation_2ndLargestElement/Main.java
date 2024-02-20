// Problem: Find the second largest element in the given array
// 
// Enter array size 
// 5
// Enter 5 elements
// 10 10 5 8 2
// Second Maximum element: 8




import java.util.Scanner;

public class Main {

    // find maximum
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    // after find maximum, find the 2nd maximum
    static int findSecondax(int[] arr){
        int mx = findMax(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE; // when maximum value match, make it min
            }
        }
        int secondMax = findMax(arr); // after making min, find the max of the new array to get 2nd max
        return secondMax;
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

        System.out.println("Second Maximum element: " + findSecondax(arr));  
    }
}