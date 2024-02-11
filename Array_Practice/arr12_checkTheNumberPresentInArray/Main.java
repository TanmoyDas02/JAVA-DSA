// Problem: Given Q queries, check if the given number is present in the array or not.
//          Note: Value of all the elements in the array is less than 10 to the power 5.
//
// Enter array size: 5
// Enter 5 elements
// 10 25 12 87 20
// Enter number of queries 5
// Enter the number to be searched 1
// NO
// Enter the number to be searched 12
// YES
// Enter the number to be searched 85
// NO
// Enter the number to be searched 1000
// NO
// Enter the number to be searched 25
// YES
//
//
// Approach:- Make a frequency array and increase the the number in the indexes(index no = given array elements value). 
//            after we check the value if the value is > 0 then it give YES otherwise NO




import java.util.Scanner;

public class Main {

    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100005]; //give the value as per question

        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
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

        int[] freq = makeFrequencyArray(arr);

        System.out.print("Enter number of queries ");
        int q = sc.nextInt();

        while(q > 0){
            System.out.print("Enter the number to be searched ");
            int x = sc.nextInt();

            if(freq[x] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            q--;
        }
    }
    
}