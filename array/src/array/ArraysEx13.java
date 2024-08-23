package array;

import java.util.Scanner;

public class ArraysEx13 {
    public static void main(String[] args) {
        int scores[];

        Scanner sc = new Scanner(System.in);
        System.out.printf("학생 수 입력 >> ");
        int num = sc.nextInt();

        scores = new int[num];
        // 최고점수 구하기
        int max = 0;
        // 평균
        int sum = 0;

        // 점수 입력
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d 번 점수 입력 >> ", (i + 1));
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];
        }

        System.out.println("최고점수 : " + max);
        System.out.println("평균점수 : " + sum / scores.length);

        // System.out.println(Arrays.toString(scores));
        sc.close();

    }

}
