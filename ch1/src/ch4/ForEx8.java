package ch4;

public class ForEx8 {
    public static void main(String[] args) {
        // 4x + 5y = 60 을 만족하는 x, y 값 출력
        // x,y는 10 이하의 자연수

        for (int X = 1; X < 11; X++) {
            for (int Y = 1; Y < 11; Y++) {
                if (4 * X + 5 * Y == 60) {

                    System.out.printf("4 * %d + 5 * %d = %d\n", X, Y, 4 * X + 5 * Y);
                }
            }
        }

        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.printf("(%d,%d)\n", x, y);
                }
            }
        }
    }

}
