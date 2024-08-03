package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigdata = new BigData();
        System.out.println( " bigdata.count =" + bigdata.count); //참조형 초기값 0
        System.out.println( " bigdata.data =" + bigdata.data); // null로 초기화함

        System.out.println("bigdata.data.value" + bigdata.data.value); //bigdata.data 가 null 임
    }

}
