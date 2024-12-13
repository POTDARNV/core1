package java8Features;

import java.util.*;
class AgeComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class ComparatorExam{
public static void main(String args[]){  

ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Nandkishor",24));
al.add(new Student(106,"Balaji",25));
al.add(new Student(105,"Chhagan",26));
  
System.out.println("Sorting by Name");  

Collections.sort(al,new NameComparator());  

for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
System.out.println("sorting by Age");
Collections.sort(al,new AgeComparator());  

for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
}  
}  