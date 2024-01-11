// 5
//     1
//    2 2
//   3   3
//  4     4
// 555555555


import java.util.Scanner;

public class pattern10_hollow_piramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i=1; i<=r; i++){ //traversing over rows
            // print r-i spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            // 
            for(int k=1; k<=2*i-1; k++){
                if(k==1 || k==2*i-1 || i==r){
                    System.out.print(i);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
