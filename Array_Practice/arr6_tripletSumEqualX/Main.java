// Count the number of triplet whose sum is equal to the given value x
// 
// Enter array size 
// 5
// Enter 5 elements
// 1 4 5 6 3
// Enter target sum 
// 12
// 
// 2





import java.util.Scanner;

public class Main {

    static int pairSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){ // first number
            for(int j = i + 1; j < n; j++){ // second number
                for(int k = j + 1; k < n; k++){ // third number
                    if(arr[i]+arr[j]+arr[k] == target){
                        ans++;
                    }
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