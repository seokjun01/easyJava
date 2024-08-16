package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 :" + 1000); // 매직넘버 발생 1000이 무슨 숫자인데
        int currentUserCount = 999;
        process(currentUserCount++); //후위 증가
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process (int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if(currentUserCount > 1000) {
            System.out.println("대기 등록");
        }else {
            System.out.println("게임에 참여");
        }
    }
}
