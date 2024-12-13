package java8Features;
@FunctionalInterface
public interface MyIterface {

    public int calculate(int x);

//public static void sayBye(){}
   // default void sayHello(){}

public class Main {
    public static void main(String[] args) {
        int a = 5;
        MyIterface s = (int x) -> x * x;
        int ans = s.calculate(a);
        System.out.println(ans);
    }

}
}





