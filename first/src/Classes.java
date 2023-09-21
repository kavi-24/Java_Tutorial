/*
Class -> an user defined data type, created from primitive data types.
*/

class Point {
    int x;
    int y;

    // constructor -> a method with the same name as the class, which will always run
    //                  whenever an instance of the class is created

   /*  Point(int n1, int n2) {
        x = n1;
        y = n2;
    } */

    Point(int x, int y) {
        this.x = x;  // this refers to the particular instance...
        this.y = y;
    }

    void getPoints() {
        System.out.println("x:" + this.x + " y:" + this.y);
    }

    // get distance from this instance to other instance
    double getDistance(Point otherPoint) {
        // ((x2-x1)^2 + (y2 - y1)^2)^(1/2)
        return Math.sqrt(Math.pow(otherPoint.x - this.x, 2) + Math.pow(otherPoint.y - this.y, 2));
    }

}

public class Classes {
    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        // static vs non static
        p1.getPoints();  // non-static reference
        // creating an instance of a class to access a non-static method

        Point p2 = new Point(5, 9);
        p2.getPoints();

        double distance = p1.getDistance(p2);
        System.out.println(distance);

        distance = p2.getDistance(p1);
        System.out.println(distance);
    }
}