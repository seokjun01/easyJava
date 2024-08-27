package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod() ; //상속 받았기 때문

        //부모 변수가 자식 인스턴스를 참조 가능(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //child 인스턴스 생성이므로 ,부모랑 자식 둘다 만들되 , 참조값은 parent 타입으로 저장
        poly.parentMethod();
        //자식은 부모를 담을 수 없다! 부모는 자식을 담을 수 있다
        //타입이 parent 이므로 childMethod는 호출 불가능



    }
}
