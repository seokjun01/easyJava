package poly.ex3;

public abstract class AbstractAnimal {
    //추상 메서드가 하나라도 있으면 추상 클래스로 정의해야함
    public abstract void sound();
//추상 클래스는 자식 클래스가 반드시 오버라이딩 해야함

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
