package basicFundamentals;

class Abc{
    static Abc abc=new Abc();
    private Abc(){

    }
    public static Abc getInstance()
    {
        return abc;
    }
}
public class Singleton {
    public static void main(String[] args) {
Abc ab=Abc.getInstance();
    }
}

