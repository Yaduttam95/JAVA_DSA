package ArrayList;
import java.util.*;

public class SwapTwoNumbersInArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(1);
        list.add(95);
        list.add(92);
        list.add(94);
        list.add(99);

        System.out.println(list);
        System.out.print("Enter Two positions to be swapped:    ");
        int idx1 = sc.nextInt()-1;
        int idx2 = sc.nextInt()-1;

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);
    }
}
