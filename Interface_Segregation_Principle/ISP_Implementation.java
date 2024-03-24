package Interface_Segregation_Principle;

interface Shape {
    int area();
}

//Interface for shapes with dimensions
interface DimensionalShape extends Shape {
    int getWidth();

    int getHeight();
}

//Rectangle class implementing DimensionalShape
class Rectangle implements DimensionalShape {
    int width, height;

    @Override
    public int area() {
        return width * height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}

class Circle implements Shape {
    int radius;

    @Override
    public int area() {
        return (int) (Math.PI * radius * radius);
    }
}

public class ISP_Implementation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 3;
        System.out.println("Area of rectangle: " +rectangle.area());

        Circle circle = new Circle();
        circle.radius = 6;
        System.out.println("Area of circle: " +circle.area());
    }
}
