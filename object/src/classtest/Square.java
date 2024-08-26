package classtest;

public class Square {
    // 직사각형(가로, 세로) 넓이, 정사각형의(가로) 넓이
    // 메소드 오버로딩

    double areaRectabgle(double w, double h) {
        return w * h;
    }

    double areaRectabgle(double w) {
        return w * w;
    }
}
