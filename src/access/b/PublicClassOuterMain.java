package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
        // import를 해도 안됨  접근 제어자가 패키지 a에서 default이기 때문

    }
}
