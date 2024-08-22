package ch3;

import java.util.Scanner;

public class ifEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Num1");
        int num4 = sc.nextInt();

        System.out.print("Input Num2");
        int num5 = sc.nextInt();

        System.out.print("Input Num3");
        int num6 = sc.nextInt();

        int min2 = num4;

        if (min2 < num5) {
            min2 = num5;
        }

        if (min2 < num6) {
            min2 = num6;
        }

        System.out.println("제일 큰수는 : " + min2);

        sc.close();
    }
}
