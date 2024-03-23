package Liskov_Subsitution_Principle;

abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class LSP_Implementation {
    public static double calculateArea(Shape shape) {
        return shape.area();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 7);
        Square square = new Square(81);

        System.out.println(calculateArea(rectangle));
        System.out.println(calculateArea(square));
    }
}

/*
In this code snippet, the class name is LSP_Implementation, and it contains the Shape, Rectangle, and Square classes
 along with the calculateArea() method and the main() method.
 */