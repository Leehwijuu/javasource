package ch3;

import java.util.Scanner;

public class ifEx5 {
    public static void main(String[] args) {
        // 근무 시간에 따른 임금 계삭
        // 근무시간 입력받기
        // 8 시간까지 시간당 기본임금(10000) 제공
        // 초과근무시간은 시간당 기본임금 1.5배 제공

        int rate = 10000, pay = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("근무시간 입력 >> ");

        int num = sc.nextInt();

        if (num > 8) {
            pay = (int) (rate * (num - 8) * 1.5) + rate * 8;
        } else {
            pay = rate + num;
        }

        System.out.printf("근무 시간 : %d, 임금 : %d\n", num, pay);

        sc.close();

    }

}
