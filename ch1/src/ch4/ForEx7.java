package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5! 출력
        // 5 * 4 * 3 * 2 * 1
        int fact = 1;
        // for (int i = 5; i > 0; i--) {
        // fact *= i;
        // }
        // System.out.printf("5! = %d\t", fact);

        // 특정 숫자의 factorial 구하기
        Scanner sc = new Scanner(System.in);
        System.out.print("factorial 구할 숫자 입력 >> ");

        // 숫자 입력 받기

        // 입력받은 숫자의 factorial 구한 후 출력

        int factorial = sc.nextInt();

        for (int i = factorial; i > 1; i--) {
            fact *= i;
        }
        System.out.printf("%d! = %d\t", factorial, fact);

        sc.close();

    }

}
