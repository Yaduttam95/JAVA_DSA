package Array.Sorting;
import Array.Operations;
import java.util.*;
public class BubbleSort extends Operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();

        int[] a = new int[n];

        input(a, n);
        display(a,n);
        bubbleSort(a,n);
        System.out.print("SORTED ");
        display(a,n);
    }

    public static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (a[j] > a[j + 1]) {
                    a[j+1] = a[j]+a[j+1]-(a[j]=a[j+1]);
                }
            }
        }
    }
}
