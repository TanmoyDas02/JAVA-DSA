// Swap two number

// Original values before swap
// a: 9
// b: 3
// Values after swap
// a: 3
// b: 9



public class swapTwoNumber{

    static void swap(int a, int b){
        System.out.println("Original values before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Using third variable
        // int temp = a;
        // a = b;
        // b = temp;


        // Without using third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        swap(a, b);
    }
}