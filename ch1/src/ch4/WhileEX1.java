package ch4;

public class WhileEX1 {
    public static void main(String[] args) {
        // for (초기화; 조건문; 증감) {}
        int i = 0;
        while (i < 10) {
            System.out.println("안녕하세요");
            i++;

        }
        i = 1;
        while (i <= 10) {
            System.out.print(i + "\t");
            i++;

        }

        System.out.println();

        int sum = 0;
        i = 1;
        while (i < 101) {
            sum = sum + i;
            i++;
        }
        System.out.println("1~100의 합 : " + sum);
    }

}
