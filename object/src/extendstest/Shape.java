package extendstest;

public class Shape {
    private String color = "black";

    void draw() {
        System.out.printf("[colar = %s\n]", color);
    }

    public String getColor() {
        return color;
    }
}
