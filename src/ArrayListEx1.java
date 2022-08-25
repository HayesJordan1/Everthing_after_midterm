import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>() ;
        Students.add("Jimmy");
        Students.add("Jacky");
        Students.add("Indy");
        Students.add("India");
        Students.add("Lydia");
        System.out.println(Students);
        System.out.println(Students.size());
        Students.add(0,"Indy");
        Students.add(1,"Indy");
        Students.remove(3);
        System.out.println(Students);
        System.out.println(Students.size());
    }
    
}
