package basicFundamentals;

class Three
{
    void m1()
    {
        System.out.println("in m1 method ");
    }
    void m1(int i)
    {
        System.out.println("in m1 method int"+i);
    }
    void m1(float i)
    {
        System.out.println("in m1 method float"+i);
    }
}

public class PolymorphismExample {
    public static void main(String args[])
    {
Three three=new Three();
three.m1();
three.m1(10);
three.m1(10.1f);
    }
}
