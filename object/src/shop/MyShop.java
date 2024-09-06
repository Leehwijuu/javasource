package shop;

import java.util.Scanner;

public class MyShop implements IShop {
    Scanner sc = new Scanner(System.in);

    private String title;

    // User 배열 생성
    User users[] = new User[2];

    // 상품 배열 생성
    Product products[] = new Product[5];

    // cart생성
    Product cart[] = new Product[10];

    // 선택된 user 담기 index보관
    private int selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        // user 2명을 생성 후 user 배열 담기
        users[0] = new User("이휘주", PayType.CARD);
        users[1] = new User("이보미", PayType.CASH);
    }

    @Override
    public void genProduct() {
        // CellPhone, SmarTv 5개 생성 후 products 배열 담기
        products[0] = new CellPhone("휴대폰1", 1500000, "KT");
        products[1] = new CellPhone("휴대폰2", 1500000, "SKT");
        products[2] = new CellPhone("휴대폰3", 1500000, "LG");
        products[3] = new SmartTv("TV1", 2000000, "4K");
        products[4] = new SmartTv("TV2", 2000000, "1080p");
    }

    @Override
    public void start() {
        // 출력
        // MyShop : 메인화면 - 계정선택
        // =============================
        // [1]홍길동 CARD
        // [2]이보미 CASH
        // [X] 종료
        // 선택 >>
        System.out.println(title + " : 메인 화면 - 계좌선택");
        System.out.println("================================================");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("[%d] %s(%s)\n", (i + 1), users[i].getName(), users[i].getPayType());
        }
        System.out.println("[X] 종료");
        System.out.println("선택 >> ");
        String input = sc.nextLine();

        switch (input) {
            case "1":
            case "2":
                // 배열 인덱스와 동일하도록 -1함
                selUser = Integer.parseInt(input) - 1;
                productList();
                break;
            case "X":
            case "x":
                System.exit(0);
                break;
            default:
                System.out.println("입력을 다시 확인해 주세요");
                start();
                break;
        }
        // 사용자 입력 : 1,2 인 경우 productst()호출
        // X 인 경우 : System.exit(0)
    }

    public void productList() {
        // 출력
        // MyShop : 상품목록 - 상품선택
        // =============================
        // [1] ~ [5] 상품
        // [h] 메인화면
        // [c] 체크아웃
        System.out.println(title + " : 상품목록 - 상품선택");
        System.out.println("================================================");

        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i++);
            product.pirntDetail();
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("선택 >> ");

        // 메뉴 받기
        // 0~4 or h or c
        // h 메인화면
        // c : checkOut(); 호출
        // 1 ~ 5 : cart 에 담기
        String input = sc.nextLine();
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
                for (int j = 0; j < cart.length; j++) {
                    if (cart[j] == null) {
                        cart[j] = products[Integer.parseInt(input)];
                        break;
                    }
                }
                productList();
                break;
            case "H":
            case "h":
                start();
                break;
            case "C":
            case "c":
                checkOut();
                break;
            default:
                System.out.println("입력을 다시 확인해 주세요");
                productList();
                break;
        }

    }

    public void checkOut() {
        System.out.println();
        System.out.println(title + " - " + users[selUser].getName() + "  체크아웃");
        System.out.println("================================================");

        int i = 0;
        int sum = 0;
        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getpName(), product.getPrice());
            }
        }

        // 결제방법 : DARD or CASH
        System.out.println("결제방법 : " + users[selUser].getPayType());
        // 합계 : 카트에 담긴 물건
        System.out.println("합계 : " + sum);
        // [p] 이전
        System.out.println("[p] 이전");
        // [q] 결제완료
        System.out.println("[q] 결재완료");

        // 입력값에 따라
        String input = sc.nextLine();
        // p : 상품목록 화면 보여주기
        switch (input) {
            case "p":
                productList();
                break;
            // q : 종료
            case "q":
                System.exit(0);
                break;
            default:
                System.out.println("입력값을 확인해 주세요");
                checkOut();
                break;
        }
    }
}
