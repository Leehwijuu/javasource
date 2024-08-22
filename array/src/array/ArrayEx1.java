package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열(array) : 같은 타입의 여러 변수를 하나의 묶음으로 다루기
        // 배열 선언 : int[] jumsu;
        // 배열 생성 : new int[4];

        // 10명의 수학 점수를 관리
        // int jumsu1 = 88, jumsu2 = 78, jumsu3 = 88......

        int[] jumsu = new int[4];

        jumsu[0] = 88;
        jumsu[1] = 78;
        jumsu[2] = 68;
        jumsu[3] = 48;

        System.out.println("학생 1번의 수학 점수 " + jumsu[0]);
        System.out.println("학생 2번의 수학 점수 " + jumsu[1]);
        System.out.println("학생 3번의 수학 점수 " + jumsu[2]);
        System.out.println("학생 4번의 수학 점수 " + jumsu[3]);

    }

}
