// sum of the given series
// 1-2+3-4+5...n

// OUTPUT
// Enter a number: 
// 5
// 3

import java.util.Scanner;

public class sum_of_the_series {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                ans -= i;
            }
            else
                ans += i;
        }

        System.out.println(ans);
    }
}

