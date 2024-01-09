// OUTPUT
// Enter a number: 
// 5
// Factorial of 1 is: 1
// Factorial of 2 is: 2
// Factorial of 3 is: 6
// Factorial of 4 is: 24
// Factorial of 5 is: 120

import java.util.Scanner;

public class print_first_nFactorial_number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fact = 1;

        for(int i=1; i<=n; i++){
            fact = fact*i;
            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}


 
