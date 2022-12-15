package Array.Searching;

import java.util.*;
import Array.Operations;

public class JumpSearch extends Operations{
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
        jumpSearch(a, n, val);
    }
    public static void jumpSearch(int[] a, int n, int val) {
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while(a[Math.min(step,n)-1]<val){
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if(prev>=n){
                System.out.println("ELEMENT NOT FOUND");
            }
        }

        while (a[prev] < val){
            prev++;
            if(prev == Math.min(step,n)){
                System.out.println("ELEMENT NOT FOUND");
            }
        }

        if(a[prev] == val){
            System.out.println("ELEMENT FOUND AT : " + (prev+1));
        }
        else {
            System.out.println("ELEMENT NOT FOUND");
        }
    }
}
