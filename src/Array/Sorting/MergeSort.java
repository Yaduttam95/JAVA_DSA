package Array.Sorting;
import Array.Operations;
import java.util.*;


public class MergeSort extends Operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();

        int[] a = new int[n];

        input(a, n);
        display(a,n);
        mergeSort(a);
        System.out.print("SORTED ");
        display(a,n);
    }

    public static void mergeSort(int[] a){
        if (a != null) {
            if (a.length>1) {
                int mid = a.length/2;

                int[] left = new int[mid];
                System.arraycopy(a, 0, left, 0, mid);

                int[] right = new int[a.length-mid];
                if (a.length - mid >= 0)
                    System.arraycopy(a, mid, right, 0, a.length - mid);

                mergeSort(left); mergeSort(right);

                int i=0; int j=0;int k=0;
                while(i < left.length && j < right.length)
                {
                    if(left[i] < right[j])
                    {
                        a[k] = left[i];
                        i++;
                    }
                    else
                    {
                        a[k] = right[j];
                        j++;
                    }
                    k++;
                }

                while(i < left.length)
                {
                    a[k] = left[i];
                    i++;
                    k++;
                }
                while(j < right.length)
                {
                    a[k] = right[j];
                    j++;
                    k++;
                }

            }
        }
    }
}
