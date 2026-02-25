package ObjectOrientedProgramming;

class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}
class Circle extends Shape {

    double radius = 5;
    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}
class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;
    @Override
    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

// Main class
public class PolymorphismDemo {

    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
