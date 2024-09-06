package extendstest;

public class Buyer {

    int money = 1000;
    int bonusPoint = 0;

    // 구입한 제품을 저장하기 위한 배열
    Computer computer[] = new Computer[3];
    Air airs[] = new Air[3];

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        money -= p.price;

        bonusPoint += p.bonusPoint;
        System.out.println("을/는 구입하셨습니다.");
    }
}
