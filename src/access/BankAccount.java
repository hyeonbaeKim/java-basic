package access;

public class BankAccount {
    private int balance;

    public BankAccount() { //command N
        balance = 0;
    }

    //모두에게 공개하는 public 메서드 : 입금
    public void deposit(int amount){
        if(isAmountValid(amount))
            balance += amount;
        else
            System.out.println("유효하지 않은 금액입니다. ");
    }

    //내부에서만 쓸 private : 입금내역 검증 -> 이렇게 기능도 다 public시키는게 아님.
    private boolean isAmountValid(int amount){
        //금액이 0보다 커야함
        return amount > 0;
    }

    //모두에게 공개하는 public 메서드 : 출금
    public void withdraw(int amount){
        if(isAmountValid(amount) && (balance - amount > 0))
            balance -= amount;
        else
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }

    //모두에게 공개하는 public 메서드 : 잔액확인
    public int getBalance(){
        return balance;
    }
}
