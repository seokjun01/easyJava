package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();
        Caw caw = new Caw();
        Animal[] animalArr = {dog, cat, caw, duck};
        //부모는 자식을 담을 수 있다

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 시작");
            animal.sound();
            System.out.println("동물 소리 종료");

        }


    }
}
