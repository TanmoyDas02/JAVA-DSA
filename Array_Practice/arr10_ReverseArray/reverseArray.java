// Reverse the given array


public class reverseArray{

    // print the array
    static void printArr(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // by taking extra array code
    static int[] reverseArr(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        // traverse original array in reverse direction
        for(int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }

        return ans;
    }

    // Without taking extra array code
    static void swapArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrIn(int[] arr){
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            swapArray(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // int[] ans = reverseArr(arr);
        // printArr(ans);
        reverseArrIn(arr);
        printArr(arr);
    }
}