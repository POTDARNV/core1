package basicFundamentals;

class One extends Thread{
    public void run()
    {
        for(int i=1;i<=100;i++){
            if (i%2==0)
            {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }
}
class Two implements Runnable {
    public void run()
    {
        for(int i=1;i<=100;i++){
            if (i%11==0)
            {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }
}
public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        One one=new One();
        Two two=new Two();
        one.start();
        Thread.sleep(10);
      two.run();

    }
}
