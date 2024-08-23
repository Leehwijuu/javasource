package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();

        // car 멤버변수, 메소드 접근 가능해짐
        System.out.println("제조사" + car.company); // null
        System.out.println("모델" + car.model); // null
        System.out.println("색상" + car.color); // null
        System.out.println("최대속력" + car.maxSpeed); // 0

        System.out.println("======================");

        // 속성 변경 가능
        car.company = "현대";
        car.model = "소나타";
        car.color = "white";
        car.maxSpeed = 200;

        System.out.println("제조사 : " + car.company); // null
        System.out.println("모델 : " + car.model); // null
        System.out.println("색상 : " + car.color); // null
        System.out.println("최대속력 : " + car.maxSpeed); // 0

        car.forward(); // 전진한다
        car.bcakward(); // 후진한다

    }

}
