package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {

        Parent parent1 = new Child(); //child는 parent 를 상속하므로 child 형으로 만들어도 캐스팅 가능
        Child child1 = (Child) parent1;
        child1.childMethod();// 문제 없음

        Parent parent2 = new Parent(); //parent 형으로 만들었기 때문에 child형 이 생성되어 있지않음
        Child child2 = (Child) parent2; //런타임 오류 -classcastException
        child2.childMethod(); // 실행 불가
    }

}
