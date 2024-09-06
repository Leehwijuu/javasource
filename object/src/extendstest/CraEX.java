package extendstest;

public class CraEX {
    public static void main(String[] args) {
        // Car 인스턴스 생성 가능여부
        // Car car = new Car(); (X) 안됌

        Car car = new SportsCar("현대"); // 자식이 오는건 허용
        car.drive();
        car.stop();
    }
}
