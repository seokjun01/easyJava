package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Pig()};
        //부모는 자식을 담을 수 있다

        for (Animal animal : animalArr) {
            soundAnimal(animal);

        }


    }
    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 종료");
    }
}
