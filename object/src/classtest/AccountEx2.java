package classtest;

import java.util.Scanner;

public class AccountEx2 {

    // 멤버 변수
    static Account[] accounts = new Account[100];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("=====================================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("=====================================================");
            System.out.println("메뉴 선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    // 계좌 생성 메소드 호출
                    createAccount();
                    break;
                case 2:
                    // 계좌 목록 메소드 호출
                    accuntList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("메뉴 번호를 확인해주세요");
                    break;
            }
        }

    }

    static void createAccount() {
        // 계좌생성 담당 메소드
        // 계좌와 관련된 정보 입력받기(계좌번호,이름,금액)
        // accounts[특정인덱스] = new Account("111-12-222", "이휘주", 10000);
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("이름 >> ");
        String owner = sc.nextLine();
        System.out.println("금액 >> ");
        int balance = Integer.parseInt(sc.nextLine());

        // 배열 요소에서 빈 공간 찾아서 채우기
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNo, owner, balance);
                System.out.println("계좌생성이 완료되었습니다.\n");
                break;
            }
        }
    }

    static void accuntList() {
        // 현재 생성된 계좌목록 출력
        System.out.println("=====================================================");
        System.out.println("계좌           이름             잔액");
        System.out.println("=====================================================");

        for (Account account : accounts) {
            if (accounts != null) {

                System.out.printf("%s\n%s\n%s\n", account.getAccountNo(), account.getOwner(), account.getBalance());
            }
        }

    }

    static void deposit() {
        // 예금하기
        // 계좌번호와 입금액 입력받기
        System.out.println("=====================================================");
        System.out.println("예금해주실 계좌번호를 써주세요");
        System.out.println("=====================================================");
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();

        System.out.println("=====================================================");
        System.out.println("예금해주실 금액을 써주세요");
        System.out.println("=====================================================");
        System.out.println("금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        Account account = findAccount(accountNo);
        if (account != null) {
            account.deposit(amount);
        }

        // 배열 요소에서 일치하는 계좌번호를 찾기
        // 찾은 account 의 deposit() 호출

    }

    static void withdraw() {
        // 출금하기
        // 계좌번호와 출금액 입력받기
        System.out.println("=====================================================");
        System.out.println("예금해주실 계좌번호를 써주세요");
        System.out.println("=====================================================");
        System.out.println("계좌번호 >> ");
        String accountNo = sc.nextLine();
        System.out.println("=====================================================");
        System.out.println("출금해주실 금액을 써주세요");
        System.out.println("=====================================================");
        System.out.println("금액 >> ");
        int amount = Integer.parseInt(sc.nextLine());

        Account account = findAccount(accountNo);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    static Account findAccount(String accountNo) {
        // 일치하는 account 리턴
        for (Account account : accounts) {
            if (account != null) {
                if (accountNo.equals(account.getAccountNo())) {
                    return account;
                }
            }

        }
        return null;
    }
}
