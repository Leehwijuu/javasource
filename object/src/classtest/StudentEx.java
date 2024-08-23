package classtest;

public class StudentEx {
    public static void main(String[] args) {

        // new Student(); 생성자 호출
        Student student1 = new Student();
        Student student2 = new Student("s1234568");
        Student student3 = new Student("s1234568", "홍길동");
        Student student4 = new Student("s9587745", "이보미", "서울시 종로구");
        Student student5 = new Student("s3002595", "이휘주", "서울시 은평구", "010-1234-56789");

        // 이름 조회
        // 메소드호출
        // 1) 리턴타입이 있는경우

        String 이름 = student3.get이름();
        System.out.println("3번 학생의 이름은 " + 이름 + " 입니다.");
        System.out.println("4번 학생의 이름은 " + student4.get이름() + " 입니다.");
    }
}
