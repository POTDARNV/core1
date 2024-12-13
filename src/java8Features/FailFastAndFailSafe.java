package java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {
    public static void main(String[] args) {
       /* List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("Mango");
        Iterator<String> iterator=fruits.iterator();

        while(iterator.hasNext())
        {
            String fruit=iterator.next();
            System.out.println(fruit);
            fruits.remove("Mango");

        }*/

        List<String> fruits=new CopyOnWriteArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Graps");
        Iterator<String> iterator=fruits.iterator();
        while (iterator.hasNext())
        {
            String frut=iterator.next();
            System.out.println(frut);
            if (!fruits.contains("Banana")) {
                fruits.add("Banana");
            }
        }
       // System.out.println(fruits);
    }
}
