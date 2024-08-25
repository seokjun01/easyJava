
package class1;

public class ProductOrderMain{
    public static void main(String[] args) {
        //여러 상품의 주문 정보 담는 배열 생성
        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        ProductOrder[] productOrders = {productOrder1,productOrder2,productOrder3};
        int totalPrice=0;

        for(int i=0; i<productOrders.length; i++) {
            ProductOrder p = productOrders[i];
            System.out.println("상품명 : " + p.productName + " 가격 : " + p.price + " 수량 : " + p.quantity);
            totalPrice += p.price * p.quantity ;

        }
        System.out.println("총 결제 금액 : " + totalPrice);
    }
}