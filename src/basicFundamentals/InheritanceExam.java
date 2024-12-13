package basicFundamentals;

class Engine1{
    void power(){
        System.out.println("1000cc");
    }
}
class car extends Engine1{

    void speed()
    {
        System.out.println("250KM");
    }
}
public class InheritanceExam extends car{
    public static void main(String[] args) {
InheritanceExam exam=new InheritanceExam();
exam.power();
exam.speed();
    }
}
