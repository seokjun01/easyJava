package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 한번은 할당 가능
        // data1 = 20;하면 컴파일 오류

        final int data2 = 10;

        method(10);
    }

    static void method(final int parameter) {
        // final 변수는 매개변수로 받아도 값 변경 불가능
    }
}
