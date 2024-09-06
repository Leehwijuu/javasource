package extendstest;

public class ProductEX {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        buyer.buy(new Computer());

        buyer.buy(new Air());

        System.out.println("현재 남은 돈 : " + buyer.money + " 만 원");
        System.out.println("현재 보너스 점수 : " + buyer.bonusPoint + " 점");

    }

}
