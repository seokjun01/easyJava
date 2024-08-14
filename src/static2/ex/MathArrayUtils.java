package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //  인스턴스 생성 막기
    }

    public static int sum(int[] values) {
       int total=0;
        for (int value : values) {
            total += value;
        }
            return total;
        }

    public static double average(int[] values) {

        double average =(double)sum(values) / values.length;
        return average;

    }

    public static int min(int[] values) {
       int min = values[0];
        for (int i=0; i< values.length; i++) {
             min= values[i];
            if(values [i] <min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
       int max= values[0];
        for (int i=0; i< values.length; i++) {
             max = values[i];
            if( values[i] >max) {
                max = values[i];
            }
        }
        return  max;
    }

}


