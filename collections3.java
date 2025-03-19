import java.util.*;
public class Iterator1 {
    public static void main(String arg[]) {
        Collection<String> Collection = new ArrayList<>();
        Collection.add("red");
        Collection.add("blue");
        Collection.add("green");
        Collection.add("orange");
        Collection.add("yellow");
        Iterator<String> Iterator1 = Collection.iterator();
        while (Iterator1.hasNext()) {
            System.out.print(Iterator1.next().toUpperCase() + " ");
        }
        System.out.println();
    }
}