package classtest;

public class DataEX {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // change(d.x); 값 복사
        change(d);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    // static void change(int x) {
    // x = 10000;
    // System.out.println("change() : X = " + x);
    // }
    static void change(Data d) {
        d.x = 10000;
        System.out.println("change() : X = " + d.x);
    }
}
