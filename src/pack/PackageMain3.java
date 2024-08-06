package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        pack.b.User userB = new pack.b.User(); // import 한 경우 , 하나는 페키지 명 전부를 작성해 줘야함
        User user = new User();
    }
}
