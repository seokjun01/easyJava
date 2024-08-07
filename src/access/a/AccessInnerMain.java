package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 기능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField =2;
        data.defaultMethod();

        //private 호출 불가

        data.innerAccess();
        //내부에서 접근하는 것이기 때문에 private도 접근 가능
    }
}
