package OOP;

public class Rectangle extends Polygon {
    // fields
    private int x;
    private int y;
    private int width;
    private int height;

    // constructors
    public Rectangle(int x, int y, int width, int height) {
        super(4);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // replicate default constructor behavior
    public Rectangle() {
        super(4);
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    // methods
    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * width + 2 * height;
    }

    @Override // optional
    public String toString() {
        return "x=" + x + ", y=" + y + ", width=" + width + ", height=" + height;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle r = (Rectangle) o;
            return this.x == r.x && this.y == r.y && this.width == r.width && this.height == r.height;
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
