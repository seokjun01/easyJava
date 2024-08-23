package extends1.super1;

public class Child  extends Parent {

        public String value = "child";

        @Override
        public void hello() {
            System.out.println("CHild.hello");
        }

        public void call() {
            System.out.println(" this value = " + this.value); // this 를 사용하면 자기를 참조하여 기능 사용
            System.out.println("super value = " + super.value); // super를 사용하면 부모 클래스의 기능을 사용

            //애초에 이름이 다르다면 알아서 찾음
            this.hello();
            super.hello();
        }

}
