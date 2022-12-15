package Array.Sorting;
import Array.Operations;
import java.util.*;

public class SelectionSort extends Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();

        int[] a = new int[n];

        input(a, n);

        display(a,n);
    }
}
