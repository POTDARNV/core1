package basicFundamentals;

abstract class main1{

    abstract void show();
    abstract void display();

}
class main2 extends main1
{
    @Override
    void show() {
        System.out.println("in basicFundamentals.main2");
    }
    @Override
    void display() {
        System.out.println("in basicFundamentals.main2");
    }
}



public class Abstaction extends main2{
    public static void main(String[] args) {
       Abstaction abstaction=new Abstaction();
       abstaction.display();
       abstaction.show();
    }


}
