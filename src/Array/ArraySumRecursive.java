package Array;
import java.util.*;

public class ArraySumRecursive {
    public static int arraySum(int[] a, int n){
        if(n<=0){
            return 0;
        }
        return (arraySum(a, n-1) + a[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();
        //Declare an Array
        int[] a = new int[n];

        System.out.println();

        //Enter Values
        for(int i=0;i<a.length;i++){
            System.out.print("Enter " + (i+1) + " Element:\t");
            a[i] = sc.nextInt();
        }
        System.out.println("ARRAY IS:");
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i] + "\t");
//        }
//        ENHANCED FOR LOOP
        for (int j : a) {
            System.out.print(j + "\t");
        }

        System.out.println("\nSum is " + arraySum(a,n));
    }
}
