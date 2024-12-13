package java8Features;

interface I1
{
     void show();
}
interface I2
{
    void show();
}
public class Demo implements I1,I2 {
    @Override
    public void show() {
        System.out.println("Hii");
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.show();
    }
}
