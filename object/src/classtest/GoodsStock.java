package classtest;

// 삼품재고
public class GoodsStock {
    // 속성
    private String goodsCode; // 상품코드(goodscode) : p1015
    private int stockNum; // 재고수량(stockNum) : 100

    // 생성자
    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    // 기능
    // 재고추가(addStock) / 재고감소(sudStock)
    void addStock(int num) {
        stockNum += num;
    }

    int sudStock(int num) {
        stockNum -= num;
        return stockNum;
    }

    // 상품코드 반환
    public String getgoodsCode() {
        return goodsCode;
    }

    // 재고수량 반환
    public int getStockNum() {
        return stockNum;
    }

}
