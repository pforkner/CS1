package OOP;

public class ShapeClient {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, 100, 200);
        Square s1 = new Square(20, 50, 120);
        Triangle t1 = new Triangle(3, 4, 5);
        Ellipse e1 = new Ellipse(50, 50, 20, 33);
        Circle c1 = new Circle(50, 50, 10);
//        Polygon p1 = new Polygon(4);

        Shape[] shapes = {r1, s1, t1, e1};
        int totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        System.out.println(totalArea);


    }
}
