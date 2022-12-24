package ArrayList;
import java.util.*;

public class SetElement {
    public static void main(String[] args) {
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

        list.set(3,50);

        System.out.println(list);
    }
}