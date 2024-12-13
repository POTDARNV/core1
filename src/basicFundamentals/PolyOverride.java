package basicFundamentals;

class Four{
    void calculate()
    {
        int c;
        int a=10;
        int b=20;
        c=a+b;
        System.out.println(c);
    }
}
public class PolyOverride extends Four {
    void calculate()
    {
        int c;
        int a=10;
        int b=20;
        c=a*b;
        System.out.println(c);
    }
    public static void main(String[] args) {

        PolyOverride override=new PolyOverride();
        override.calculate();

    }
}
