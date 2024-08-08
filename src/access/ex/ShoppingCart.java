package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item tem) {
        if(itemCount >= items.length) {
            System.out.println( "상품 등록 갯수 초과 ");
            return;
        }
        items[itemCount] = tem;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 목록 출력");
        for(int i=0; i< itemCount; i++) {
            Item item = items[i];
            System.out.println(" 상품명 : " + item.getName() + "상품 가격 : " + item.getPrice() + "상품 수량 :" + item.getQuantity());
        }
        System.out.println(" 전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice=0;
        for (int i=0; i<itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
