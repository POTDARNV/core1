package java8Features;


import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap();
        map.put("Z",4);
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 5);
        map.put("E", 6);
        map.put("F", 7);
        map.put("G", 8);
        map.put("H", 9);
        map.put("I", null);
        System.out.println(map.size());
        System.out.println(map);
//nullPointerException
    }
}
