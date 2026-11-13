package access;

import java.util.Arrays;

public class BankAccountMain {
    static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());

        /*
        이렇게 BankAccount를 사용하는 입장에서는 withdraw, deposit, getBalance 3개의 기능만 알면된다.
        나머지 복잡한 내용은 모두 BankAccount 안에 숨어있다.

        만약 isAmountValid필드를 외부에 노출하면 어떻게 될까? BankAccount를 사용하는 개발자입장에서는
        사용할 수 있는 메서드가 1개 더 늘었다. 그리고 그 개발자는 account를 입금,출금하기전에 이걸 먼저 검증해야하나?
        라고 의문을 가질 것이다.
         */
    }
}
