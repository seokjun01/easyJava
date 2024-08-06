package pack.a;

public class User {

    public User() { //다른 패키지에서 위 클래스의 생성자를 호출하려면 public을 붙여야 함.
        System.out.println("패키지 pack.a 회원 생성");
    }
}
