package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count : " + Data3.count); //클래스 명에 (.)을 사용하여 접근 메서드영역에서 관리함

        Data3 data2 = new Data3("b");
        System.out.println("A count : " + Data3.count);

        Data3 data3 = new Data3("c");
        System.out.println("A count : " + Data3.count);

        //인스턴스를 통해 클래스변수에 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        //가져다 쓰는 입장에서 정적 변수인지 , 인스턴스 변수인지 구별이 잘 안감
    }
}
