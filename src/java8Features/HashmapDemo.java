package java8Features;

import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {

            HashMap<Integer,String> h=new HashMap();
            h.put(100,"Stark");
            h.put(101,"Michale");
            h.put(102,"Ani");
            h.put(null,"Sofia");
            h.put(103,null);
            System.out.println(h);

    }
}
