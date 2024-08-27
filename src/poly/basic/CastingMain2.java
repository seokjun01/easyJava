package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        // 자식의 기능을 호출할 수 없었음
        // 다운 캐스팅(부모 타입 -> 자식 타입)
     /*  Child child = (Child)poly; //참조값 넘기기
        child.childMethod();
    */
        //번거로운 과정없이 다운캐스팅하기(일시적 다운캐스팅)
        ((Child) poly).childMethod(); //연산자 우선순위를 변수로 하기 위해 괄호 쳐주기
    }
}
