package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name =name;
        this.price = price;
        this.quantity = quantity;
    }
// 위 클래스 내부에서 값을 끌어오므로 , 굳이 매개변수로 받을 필요 x
    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
    public int getPrice() {
        return price ;
    }
    public int getQuantity() {
        return quantity;
    }
}
