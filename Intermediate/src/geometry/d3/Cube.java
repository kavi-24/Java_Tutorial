package geometry.d3;

public class Cube {
    private int side;

    public Cube(int side) {
        this.side = side;
    }

    private int area() {
        return 6 * side * side;
    }

    public int volume() {
        return side * side * side;
    }

    public double diagonal() {
        return Math.sqrt(3) * side;
    }

    // using getters and setters
    public int getArea() {
        return this.area();
    }

    public void setSide(int side) {
        this.side = side;
    }

}
