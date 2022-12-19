package Array.Sorting;
import Array.Operations;
import java.util.*;
public class InsertionSort extends Operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();

        int[] a = new int[n];

        input(a, n);
        display(a,n);
        insertionSort(a,n);
        System.out.print("SORTED ");
        display(a,n);
    }

    private static void insertionSort(int[] a, int n) {
        for (int i = 1; i < n; ++i) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
        }
    }
}
