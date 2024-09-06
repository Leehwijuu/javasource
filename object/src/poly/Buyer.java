package poly;

public class Buyer {

    int money = 1000;
    int bonusPoint = 0;

    // 구입한 제품을 저장하기 위한 배열
    Product[] Product = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        money -= p.price;

        bonusPoint += p.bonusPoint;
        Product[i++] = p; // 장바구니에 담기
        System.out.println("을/는 구입하셨습니다.");
    }

    void summary() {
        // 구매한 물품에 대한 정보 출력
        int sum = 0;
        String itemList = "";

        for (Product product : Products) {
            if (product != null) {
                sum += product.price;
                itemList += product + ", ";
            }
        }
        // 구입한 물품의 총 금액은 ~~ 만원입니다.
        System.out.printf("구입한 물품의 총 금액은 %d 만원입니다.\n", sum);
        // 구입한 제품은 Computerm, Air 입니다.
        System.out.printf("구입한 제품은 %s 입니다.\n", itemList);
    }

    void buy(Air air) {
        if (money < air.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        money -= air.price;

        bonusPoint += air.bonusPoint;
        System.out.println(computer + "을/를 구입하셨습니다.");
    }
}
