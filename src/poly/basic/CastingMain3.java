package poly.basic;
//UpCasting vs DownCasting
public class CastingMain3 {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 캐스팅 생략 가능
        Parent parent2 = child; // 생략 권장

        parent1.parentMethod();
        parent2.parentMethod();
    }


}
