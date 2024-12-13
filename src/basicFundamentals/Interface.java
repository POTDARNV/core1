package basicFundamentals;

interface shape
{
   double calculateArea();
}



class Circle implements shape{
private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements shape
{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length*width;
    }
}
public class Interface {
    public static void main(String[] args) {

        Circle circle=new Circle(10);
        System.out.println("Area of circle::"+circle.calculateArea());
        Rectangle rectangle=new Rectangle(10,15);
        System.out.println("Area of rectangle::"+rectangle.calculateArea());
    }
}
