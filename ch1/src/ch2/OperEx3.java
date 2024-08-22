package ch2;

public class OperEx3 {
    public static void main(String[] args) {
        // 534 자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때 학생 한 명당 몇개를
        // 나눠가질 수 있고 최종적으로 몇 개가 남는지 출력하기
        // 조건 ) 변수 사용

        int a = 534;
        int b = 30;

        System.out.printf("학생 한 명 당 %d 자루", (a / b));
        System.out.printf("남은 연필 %d 자루", (a % b));

        // 사다리꼴의 넓이 구하기
        // 윗변 : 5, 아랫변 : 10, 높이 : 7

        int top = 5;
        int bottom = 10;
        int height = 7;
        double result = (double) (top + bottom) * height / 2; // 52.5
        System.out.printf("사다리꼴 넓이는 %.1f\n", result);

        // 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num 의 값을 뺀 나머지를 구한 후 출력
        // 예를 들어 24 라면 24보다 크면서 가장 가까운 10의 배수는 30 - 24 = 6 이 출력 되도록 한다
        int lumit, num, count;

        System.out.printf("1부터 %d까지의 수중에 %d의 배수는 %d개 입니다\n", lumit, num1, count);

    }
}
