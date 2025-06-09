package OOP;

public class Triangle extends Polygon {
    int a, b, c; // has three sides

    public Triangle(int a, int b, int c) {
        super(3);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super(3);
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public int area() {
        // use heron's formula
        // https://en.wikipedia.org/wiki/Heron%27s_formula
        double s = 0.5*(a + b + c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return (int)area;
    }

    public int perimeter() {
        return a + b + c;
    }

    public String toString() {
        return "Triangle: (" + a + ", " + b + ", " + c + ")";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

}
