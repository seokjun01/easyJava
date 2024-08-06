package Constructor;

public class Member {
    String name;
    int age;
    int grade;


    Member(String name, int age) {
        this(name, age , 50);

    }

    Member(String name, int age, int grade) {
        System.out.println("생성자 생성 이름 : " + name + "나이 : " + age + "성적 : " + grade );
        this.name = name;
        this.age =age;
        this.grade = grade;
    }
}
