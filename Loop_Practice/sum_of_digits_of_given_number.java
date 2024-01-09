/**
 * sum_of_digits_of_given_number
 */

// OUTPUT
// Enter a number: 
// 123456
// 21


import java.util.Scanner;

public class sum_of_digits_of_given_number {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int originalNumber = num;

        while(originalNumber > 0){
            sum += originalNumber%10;
            originalNumber = originalNumber/10; 
        }

        System.out.println(sum);
    }
}

