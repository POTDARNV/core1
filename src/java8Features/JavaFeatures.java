package java8Features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFeatures {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("Nandkishor");
        list.add("Potdar");
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime time = LocalTime.now();
        System.out.println("the current time is "+
                time);
    }
}
