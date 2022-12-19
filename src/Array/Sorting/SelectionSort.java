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
        selectionSort(a,n);
        System.out.print("SORTED ");
        display(a,n);
    }

    public static void selectionSort(int[] a, int n){
        for( int i = 0; i < n - 1; i++ ){
            int minIndex = i;
            for( int j = i + 1; j < n; j++){

                if ( a[j] < a[minIndex] )
                    minIndex = j;
            }
            a[minIndex] = a[i]+a[minIndex]-(a[i]=a[minIndex]);
        }
    }
}
