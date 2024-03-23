package Open_Closed_Principle;


interface Shape{
    void draw();
}

class circle implements Shape{
@Override
public void draw(){
    System.out.println("Drawing Circle");
   }
}

class square implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Square");
    }
}

public class OCP_Implementation {
    public void drawShape(Shape shape){
        shape.draw();
    }
}

class main{
    public static void main(String[] args) {
        OCP_Implementation ocpImplementation = new OCP_Implementation();

        Shape circle = new circle();
        Shape square = new square();

        ocpImplementation.drawShape(circle);
        ocpImplementation.drawShape(square);
    }
}

/*
In this example, the  OCP_Implementation  class is open for extension because you can easily add new shapes by creating
new classes that implement the  Shape  interface without modifying the  Drawing  class. This way, the  ocp_implementation class is closed for modification but open for extension, following the Open-Closed Principle.
 */