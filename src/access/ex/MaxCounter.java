package access.ex;

public class MaxCounter {
   private int count;
    private int max;
    //다른패키지에서도 사용 가능해야함으로, public 사용
  public  MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count >= max){
            System.out.println(" 값 초과");
        } else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
