package project3;

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape {
    double radius;
    double pi;

    Circle(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the circle is " + ((radius * radius) * pi));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of the circle is " + (radius * radius) * pi * 2);
    }
}
class Square implements Shape{
   int length;
   int width;
   Square(int length, int width){
     this.length=length;
     this.width=width;
   }
    @Override
    public void calculateArea() {
        System.out.println("The area of square is "+(length*width));
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of square is "+(length*4));
    }

    public static void main(String[] args) {
        Circle test=new Circle(5,3.14);
        test.calculateArea();
        test.calculatePerimeter();
        Square test2=new Square(6,6);
        test2.calculateArea();
        test2.calculatePerimeter();
    }
}
