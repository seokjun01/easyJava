
import java.util.Scanner;

    public class Bit {
        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);

            System.out.println("세탁기 초기상태 Byte를 입력하세요 (0~127 :)");
            int status = sc.nextInt();

            System.out.println("세탁기 입력상태 =" +Integer.toBinaryString(status));

            checkmethod();

        }

        public static void checkmethod(Integer.toBinaryString(status)) {
            int[] CheckNum = {1,2,4,8,16,32,64};
            for (int i : CheckNum) {
                if ((status & 1) != 0)) {
                    System.out.println("전기가 연결됨");
                if ((status & 2) != 0)) {
                    System.out.println("수도가 연결됨");
                if ((status & 4) != 0)) {
                    System.out.println("문이 닫힘");
                if ((status & 8) != 0)) {
                    System.out.println("빨래가 들어 있음");
                if ((status & 16) != 0)) {
                    System.out.println("빨래 양이 많음");
                if ((status & 32) != 0)) {
                    System.out.println("배수관이 막혀 있음");
                if ((status & 64) != 0)) {
                    System.out.println("빨래가 치우쳐져 있음");
            }
            }
        }

    }
