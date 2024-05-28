import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        //getting elements
        int element = list.get(2);
        System.out.println(element);
        //adding elements in the between
        list.add(1,1);
        System.out.println(list);
        //set element
        list.set(1,10);
        System.out.println(list);
        //deleting element
        list.remove(4);
        System.out.println(list);
        //size
        int size = list.size();
        System.out.println(size);
        //loops
        for(int i =0; i<size; i++){
            System.out.println(list.get(i));
        }
        //sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
