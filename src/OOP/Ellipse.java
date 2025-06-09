package OOP;

public class Ellipse implements Shape {
    int x; // x coordinate of the center
    int y; // y coordinate of the center
    int a; // semi-major axis
    int b; // semi-minor axis

    public Ellipse(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public Ellipse() {
        this.x = 0;
        this.y = 0;
        this.a = 0;
        this.b = 0;
    }

    public String toString() {
        return "Ellipse [a=" + a + ", b=" + b + "]";
    }

    public int area() {
        return (int)(Math.PI*a*b);
    }
    // https://en.wikipedia.org/wiki/Ellipse#Circumference
    public int perimeter() {
        double h = Math.pow((a - b), 2)/Math.pow((a + b),2);
        return (int)(1 + h/4 + Math.pow(h, 2)/64 + Math.pow(h, 3)/256);
    }

}
