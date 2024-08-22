package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위1 바위2 보3 게임

        // 컴퓨터가 내는 부분

        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 : 입력받기

        Scanner sc = new Scanner(System.in);
        System.out.printf("가위(1) 바위(2) 보(3) 입력 >> ");

        int user = sc.nextInt();

        switch (user - computer) {
            case 2:
            case -1:
                System.out.println("user 패");
                break;
            case 1:
            case -2:
                System.out.println("user 승");
                break;
            case 0:
                System.out.println("무승부");
        }

        sc.close();

    }
}
