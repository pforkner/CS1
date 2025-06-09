package OOP;

public abstract class Polygon implements Shape {
    int numberOfSides;

    public abstract int area();
    public abstract int perimeter();

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public Polygon() {
        this.numberOfSides = 0;
    }
}
