// 6
// 123456
// 234561
// 345612
// 456123
// 561234
// 612345


import java.util.Scanner;

public class pattern5_numerical_rectangular {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){ //traversing over rows
            // print i to r numbers
            for(int j=i; j<=r; j++){
                System.out.print(j);
            }

            // print 1 to i-1 numbers
            for(int k=1; k<=i-1; k++){
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
