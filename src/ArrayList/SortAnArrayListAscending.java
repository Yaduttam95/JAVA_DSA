package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayListAscending {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(92);
        list.add(7);
        list.add(9);
        list.add(99);
        list.add(1);
        list.add(95);
        list.add(12);
        list.add(94);


        System.out.println(list);
        System.out.println("After Sort");
        Collections.sort(list);
        System.out.println(list);
    }
}
