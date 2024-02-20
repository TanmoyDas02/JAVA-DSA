// Target sum
// Find the total number of pairs in the Array whose sum is equal to the
// given value x.
// 
// Output-
// Enter array size 
// 6
// Enter 6 elements
// 4 5 2 3 8 1
// Enter target sum 
// 9
// 2



import java.util.Scanner;

public class Main {

    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
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

        System.out.println("Enter target sum ");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));  
    }
}
