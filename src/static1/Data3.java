package static1;

public class Data3 {
    public String name;
    public static int count;// 정적, static , class변수

    public Data3(String name) {
        this.name=name;
        count++;
    }
}
