package OOP;

public class RectangleClient {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20, 100, 200);
        Rectangle r2 = new Rectangle(10, 20, 100, 200);
        Rectangle r3 = r1;
//        r3.setX(77);
//        r1.setX(50);
//        System.out.println(r1.toString());
//        System.out.println(r1.getX());

        Square s1 = new Square(20, 50, 120);
//        System.out.println(s1.perimeter());

        Rectangle[] rects = new Rectangle[3];
        rects[0] = r1;
        rects[1] = r2;
        rects[2] = s1;
        for (Rectangle r : rects) {
            System.out.println(r);
        }

        String name = "Phillip";
        String name2 = new String("Phillip");
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println("-----");
        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
        System.out.println(r3.hashCode());


        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println(t1);
    }

}
