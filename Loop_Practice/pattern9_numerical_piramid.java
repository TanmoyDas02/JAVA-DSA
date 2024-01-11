// 5
//     1
//    121
//   12321
//  1234321
// 123454321


import java.util.Scanner;

public class pattern9_numerical_piramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){ //traversing over rows
            // print r-i spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            // print 1 to i numbers
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }

            // print i-1 to 1 numbers
            for(int m=i-1; m>=1; m--){
                System.out.print(m);
            }

            System.out.println();
        }
    }
}
