// Search the given element x in the array. If present then return
// the index else return -1 (Linear Search)


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,5,3,6,2,8,5};
        int x = 5;

        int ans = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        System.out.println("Found the element " + x + " at index "+ ans);
    }
}