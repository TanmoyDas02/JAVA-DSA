// OUTPUT
// Enter a number: 
// 1234
// 4321


import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        int num = n;

        while(num > 0){
            ans = ans*10 + num%10;
            num = num/10;
        }

        System.out.println(ans);
    }
}


