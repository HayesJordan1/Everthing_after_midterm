import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(13);
        numbers.add(8);
        numbers.add(7);
        numbers.add(0);
        ListIterator<Integer> listIterator = numbers.listIterator();


        while(listIterator.hasNext()){
            System.out.println("Number is: " + listIterator.next());
        }
         
    }
}
