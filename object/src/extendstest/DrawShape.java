package extendstest;

public class DrawShape {
    public static void main(String[] args) {

        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100),
        };

        Triangle Triangle = new Triangle(p);

        Point p1 = new Point(150, 150);
        Circle circle = new Circle(p1, 50);

        Triangle.draw();
        circle.draw();
    }
}
