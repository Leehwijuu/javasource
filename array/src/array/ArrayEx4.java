package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 배열 : 한 번 생성하면 길이 변경 불가

        // 10명 학생의 점수 배열 생셩
        int jumsu[] = { 88, 78, 68, 35, 18, 24, 35, 12, 35, 52 };

        // 5명의 점수가 추가되야 한다면?
        // 15명의 점수를 담을 저장공간 생성
        int jumsu2[] = new int[15];
        // 기존 10명의 점수를 복사

        jumsu2[10] = 35;
        jumsu2[11] = 34;
        jumsu2[12] = 22;
        jumsu2[13] = 45;
        jumsu2[14] = 34;

        for (int i = 0; i < jumsu.length; i++) {
            jumsu2[i] = jumsu[i];
        }

        // 복사 후 확인
        for (int i = 0; i < jumsu2.length; i++) {
            System.out.printf("%d\t", jumsu2[i]);
        }

        // 5명의 점수를 입력 받은 후 배열 요소 채우기
        System.out.println();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            System.out.printf("%d 번 학생 점수 입력 : ", i);
            jumsu2[i] = sc.nextInt();

        }

        // 확인
        System.out.println(Arrays.toString(jumsu2)); // [99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        sc.close();
    }
}
