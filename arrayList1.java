// add method

import java.util.*;
class arrayList1
{
    public static void main(String ar[])
    {
        List <Integer> li=new ArrayList();
        li.add(10);
        li.add(20);
        li.add(30);
        System.out.print(li);
    }
}

// add all method
import java.util.*;
class arrayList1
{
    public static void main(String ar[])
    {
        List <Integer> li=new ArrayList();
        List <Integer> li2=new ArrayList();
        li.add(10);
        li.add(20);
        li.add(30);

        li2.add(90);
        li2.add(100);
        li.addAll(li2);
        System.out.print(li);
        System.out.println(li2);
    }
}

// for loop
import java.util.*;
class arrayList1
{
    public static void main(String ar[]) {
        List<Integer> li = new ArrayList();
        List<Integer> li2 = new ArrayList();
        li.add(10);
        li.add(20);
        li.add(30);

        li2.add(90);
        li2.add(100);
        li.addAll(li2);
        for (int i : li) {
            System.out.print(li);
        }
    }
}
