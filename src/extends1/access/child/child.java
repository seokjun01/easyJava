package extends1.access.child;

import extends1.access.parent.Parent;

public class child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 or 같은 패키지
        //default는 접근 불가
        //private 접근불가
        printParent();
    }

}
