package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {
        // 사용자로부터 한달 월급을 입력받은 후 월급을 10년간 저축한 금액은 얼마인지 출력

        Scanner sc = new Scanner(System.in);

        System.out.print("월급을 입력해주십시오 (만 단위) >> ");

        int salary = sc.nextInt();

        int deposit = salary * 12 * 10;

        System.out.printf("한달 월급 : %d, 10년 저축금액 : %d\n", salary, deposit);

        sc.close();

    }
}
