package homeWork20;

public class Shape {
    /*
    1. Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
    In circle class create a method to calculate the area of circle. Test your code
    */

    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    double pi;

    Circle(double radius, double pi){
        super(radius);
        this.pi=pi;
    }
    void area(){
        System.out.println("The area of the circle is "+((radius*radius)*pi));
    }

    public static void main(String[] args) {
        Circle area=new Circle(5,3.14);
        area.area();

    }
}


