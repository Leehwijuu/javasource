package classtest;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        long result1 = math.add(20L, 5L);
        long result2 = math.subtract(30L, 17L);
        long result3 = math.multiply(6L, 7L);
        double result4 = math.divide(5L, 0L);
        int result5 = math.divide(5, 0);
        int result6 = math.max(20, 21);

        System.out.println("add(20L, 5L) = " + result1);
        System.out.println("subtract(30L, 17L) = " + result2);
        System.out.println("multiply(6L, 7L) = " + result3);
        System.out.println("divide(20L, 10L) = " + result4);
        System.out.println("divide(20L, 10L) = " + result5);
        System.out.println("max(20L, 21L) = " + result6);

        MyMath2 math2 = new MyMath2(15, 5);
        // 인스턴스 메소드 사칙연산
        System.out.println("15 + 5 = " + math2.add());
        System.out.println("15 - 5 = " + math2.subtract());
        System.out.println("15 * 5 = " + math2.multiply());
        System.out.println("15 / 5 = " + math2.divide());

        // 클래스 메소드 사칙연산
        System.out.println("15 + 5 = " + MyMath2.add(15, 5));
        System.out.println("15 - 5 = " + MyMath2.subtract(15, 5));
        System.out.println("15 * 5 = " + MyMath2.multiply(15, 5));
        System.out.println("15 / 5 = " + MyMath2.divide(15, 5));

    }
}
