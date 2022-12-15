package Array.Searching;
import java.util.*;
import Array.Operations;

public class LinearSearch extends Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();

        int[] a = new int[n];

        input(a, n);

        display(a,n);

        System.out.print("Enter Value to Find:    ");
        int val = sc.nextInt();
        linearSearch(a,n,val);
    }

    public static void linearSearch(int[] a, int n, int val) {
        int i;
        for(i=0;i<n;i++){
            if(val == a[i]){
                System.out.println("Item found at " + (i+1));
                break;
            }
        }
        if(i==n){
            System.out.println("Item not found");
        }
    }
}
