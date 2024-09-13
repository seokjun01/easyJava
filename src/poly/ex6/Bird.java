package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{ //extends가 먼저나와야함, 구현은 무제한 가능하기 때문
    @Override
    public void sound() {
        System.out.println("Bird sound");
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
