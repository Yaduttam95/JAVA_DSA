package ArrayList;

import java.util.ArrayList;

public class ReverseOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listrev = new ArrayList<>();

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

        for(int i = (list.size()-1); i>=0; i--){
            listrev.add(list.get(i));
        }

        System.out.println(listrev);
    }
}
