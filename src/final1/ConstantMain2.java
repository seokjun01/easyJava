package final1;

public class ConstantMain2 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 :" + Constant.MAX_USERS); // 매직넘버 발생 1000이 무슨 숫자인데
        int currentUserCount = 999;
        process(currentUserCount++); //후위 증가
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process (int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if(currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기 등록");
        }else {
            System.out.println("게임에 참여");
        }
    }
}
