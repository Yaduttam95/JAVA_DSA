package Array;
import java.util.*;

public class Operations {
    static Scanner sc = new Scanner(System.in);
    public static void input(int[] a,int n){
        for(int i=0;i<n;i++) {
            System.out.print("Enter " + (i + 1) + " Element:\t");
            a[i] = sc.nextInt();
        }
    }

    public static void display(int[] a, int n){
        System.out.println("ARRAY IS:");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}
