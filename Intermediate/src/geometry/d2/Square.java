package geometry.d2;

public class Square {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

    public double diagonal() {
        return Math.sqrt(2) * side;
    }
}
