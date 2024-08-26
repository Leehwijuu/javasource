package classtest;

// this : 자기자신
// super : 부모

public class Student {
    // 속성
    private String 학번; // 학번 s12345678
    private String 이름;// 이름 홍길동
    private String 주소; // 주소 서울시 종로구
    private String 핸드폰;// 핸드폰 010-1234-1234

    // 생성자
    // 클래스 이름(){}
    // 생성자를 명시하지 않는다면 컴파일러가 default 생성자를
    // 자동으로 생성함
    // 생성자 목적
    // 인스턴스 초기화 메소드

    // 생성자 ~

    // 생성자 오버로딩

    public Student() {
    }

    public Student(String 학번) {
        this.학번 = 학번;
    }

    public Student(String 학번, String 이름) {
        // this.학번 = 학번;
        this(학번);
        this.이름 = 이름;
    }

    public Student(String 학번, String 이름, String 주소) {
        this(학번, 이름);
        this.주소 = 주소;
    }

    public Student(String 학번, String 이름, String 주소, String 핸드폰) {
        this(학번, 이름, 주소);
        this.핸드폰 = 핸드폰;
    }

    // 메소드
    // 특정 작업을 수행하는 일련의 문장들을 하나로 묶는 것
    // 재사용성, 중복된 코드 제거, 프로그램 구조 구조화

    // 리턴타입 메소드명(){}
    // 정수bro,실수bro,논리bro,문자bro, void
    public String get이름() {
        return 이름;
    }

}
