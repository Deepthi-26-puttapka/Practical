import java.util.*;
public class list1 {

    public static void main(String ar[])
    {
        List<String> li=new ArrayList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        System.out.println("list: "+li);
        ListIterator<String> iterator=li.listIterator();
        System.out.println("list iterators in forward directions");
        boolean elementsPresent=iterator.hasNext();
        System.out.println(elementsPresent);
        int indexA=iterator.nextIndex();
        String elementA=iterator.next();
        System.out.println("IndexA= "+" "+"elements:"+elementA);

        int indexB=iterator.nextIndex();
        String elementB=iterator.next();
        System.out.println("IndexB= "+" "+"elements:"+elementB);

        int indexC=iterator.nextIndex();
        String elementC=iterator.next();
        System.out.println("IndexC= "+" "+"elements:"+elementC);

        boolean elementsPresent2=iterator.hasNext();
        System.out.println(elementsPresent2);
        String element=iterator.next();
    }
}
