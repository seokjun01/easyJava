package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        // 자식의 기능을 호출할 수 없었음
        // 다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child)poly; //참조값 넘기기
        child.childMethod();
    }
}
