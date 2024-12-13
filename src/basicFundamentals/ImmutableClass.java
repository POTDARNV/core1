package basicFundamentals;

class Engine{
    int speed;
    public Engine(int speed) {
        this.speed = speed;
    }
}

public final class ImmutableClass {
private final int id;
private final String name;
private Engine engine;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public ImmutableClass(int i, String n, Engine engine) {
        this.id = i;
        this.name = n;
        Engine newEngine=new Engine(engine.speed);
        this.engine = newEngine;
    }

    public static void main(String[] args) {
Engine e=new Engine(50);
ImmutableClass a=new ImmutableClass(1,"Bullet",e);
        System.out.println(a.name=="Bullet");
        System.out.println(a.engine.speed);
        e.speed=70;
        System.out.println(a.engine.speed);
    }
}
