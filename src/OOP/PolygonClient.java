package OOP;

public class PolygonClient {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, 100, 200);
        Square s1 = new Square(40, 50, 120);
        Triangle t1 = new Triangle(5, 12, 13);

        Polygon[] polygons = new Polygon[3];
        polygons[0] = r1;
        polygons[1] = s1;
        polygons[2] = t1;

        int total_area = 0;
        for (Polygon p : polygons) {
            total_area += p.area();
        }
        System.out.println(total_area);
    }
}
