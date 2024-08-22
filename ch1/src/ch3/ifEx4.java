package ch3;

import java.util.Scanner;

public class ifEx4 {
    public static void main(String[] args) {
        // 숫자를 하나 입력받은 후 립력 받은 숫자가 짝수, 홀수 출력

        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자 입력 >> ");

        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.printf("짝수");
        } else {
            System.out.printf("홀수");
        }

        sc.close();

    }

}
