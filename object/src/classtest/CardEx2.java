package classtest;

import java.util.Arrays;

public class CardEx2 {
    public static void main(String[] args) {
        // Card 인스턴스를 10개 생성해야 한다면?
        // Card card1 = new Card("spade", 1);
        // Card card2 = new Card("spade", 2);
        // Card card3 = new Card("spade", 3);
        // Card card4 = new Card("spade", 4);
        // Card card5 = new Card("spade",5);
        // Card card6 = new Card("spade", 6);
        // Card card7 = new Card("spade", 7);
        // Card card8 = new Card("spade", 8);
        // Card card9 = new Card("spade", 9);
        // Card card10 = new Card("spade", 10);

        // 배열
        int arr[] = new int[10];
        System.out.println(Arrays.toString(arr));

        // 객체배열
        // Card 객체 담기
        // Card cards[] = new Card[3];
        // System.out.println(Arrays.toString(arr));
        // cards[0] = new Card("spade", 1);
        // cards[1] = new Card("heart", 1);
        // cards[2] = new Card("diamond", 1);
        // System.out.println(Arrays.toString(cards));

        // Card cards[] = {
        // new Card("spade", 1),
        // new Card("heart", 1),
        // new Card("diamond", 1)
        // };

        Card card1 = new Card("spade", 1);
        Card card2 = new Card("heart", 1);
        Card card3 = new Card("diamond", 1);

        Card cards[] = { card1, card2, card3 };

        for (Card card : cards) {
            System.out.println("Kind " + card.getKind() + ", number " + card.getNumber());
        }
    }
}
