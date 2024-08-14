package static2.ex;

public class Car {
    private String name;
    private static int count;

    public Car(String name) {
        System.out.println("구매 차량 이름 : " + name);
        this.name = name;
        count++;
    }
    public static void showTotalCar() {
        System.out.println("구매 한 차량 수 :" + count);
    }
}




