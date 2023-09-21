import geometry.d2.Square;
import geometry.d3.Cube;

public class Packages {
    public static void main(String[] args) {
        Square s1 = new Square(5);
        s1.side = 5;
        System.out.println(s1.area());

        Cube c1 = new Cube(6);
        c1.setSide(5);
        System.out.println(c1.diagonal());

    }
}
