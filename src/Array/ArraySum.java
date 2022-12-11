package Array;
import java.util.*;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();
        //Declare an Array
        int a[] = new int[n];

        System.out.println();

        //Enter Values
        for(int i=0;i<a.length;i++){
            System.out.print("Enter " + (i+1) + " Element:\t");
            a[i] = sc.nextInt();
        }
        System.out.println("ARRAY IS:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + "\t");
        }

        int suma = 0;
        for(int i = 0;i<a.length;i++){
            suma+=(a[i]);
        }
        System.out.println("\nSum is : " + suma);
    }
}
