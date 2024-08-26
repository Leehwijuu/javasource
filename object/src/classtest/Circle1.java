package classtest;

public class Circle1 {
    // 속성
    private double radius; // 반지름(radius) : 3.5

    public Circle1(double radius) {
        this.radius = radius;
    }

    // 기능
    // 원의 넓이 : 반지름 * 반지름 * 3.14;
    double raDius() {
        return radius * radius * 3.14;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}