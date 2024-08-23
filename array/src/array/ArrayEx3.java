package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 배열 선언, 생성
        // 타입[] 배열명 = {'a', 'b', 'c', 'd'};
        // 타입 배열명[]

        char[] chArr = { '가', '나', '다', '라' };

        System.out.println(Arrays.toString(chArr));

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + "\t");
        }

        // 향상된 for문
        for (char c : chArr) {
            System.out.print(c + "\t");
        }

        float[] faArr = { 12.5f, 13.6f, 14.5f, 13.7f };

    }

    // float 배열 선언, 생성
    float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };(float f:faArr)
    {
        System.out.print(f + "\t");

    }

    // String 배열 선언, 생성
    String[] strArr = { "A", "B", "C", "D", "E", "F" };System.out.println(strArr[5]);for(
    float s:strArr)
    {
        System.out.print(s + "\t");

    }
}

}
