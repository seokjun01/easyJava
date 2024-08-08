package access;
//데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화
public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    //public method 생성 입금,
    public void deposit(int amount) {
        if (isAmountValid(amount) == true) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액");
        }
    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else{
            System.out.println("유효하지 않은 금액");
        }
    }
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount >0;
    }

    public  int getbalance() {
        return balance;
    }
}
