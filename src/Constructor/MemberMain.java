package Constructor;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("석준" , 24, 90);
        Member member2= new Member("은혜" , 25, 80);

        Member[] members = {member1, member2};

        for (Member s : members) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age + "성적 : " + s.grade);
        }

    }
}
