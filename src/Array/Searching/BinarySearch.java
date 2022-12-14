package Array.Searching;
import java.util.*;
import Array.Operations;

public class BinarySearch extends Operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements:\t");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("ENTER ELEMENT IN ASCENDING ORDER");
        input(a, n);

        display(a,n);

        System.out.print("Enter Value to Find:    ");
        int val = sc.nextInt();
        binarysearch(a,n,val,0,n);
    }

    public static void binarysearch(int[] a, int n, int val, int low, int high) {
        boolean found = false;
        int mid = 0;
        while(low<=high) {
            mid=(low+high)/2;
            if(a[mid]==val)
            {
                found=true;
                break;
            }
            if(val>a[mid])
            {
                low=mid+1;
            }
            if(val<a[mid])
            {
                high=mid-1;
            }

        }
        if(found)
        {
            System.out.println("FOUND AT POSITION " + (mid+1));
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
