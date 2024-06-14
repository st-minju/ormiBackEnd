package JavaStudy0614;

public class BankAccount {
  private int balance;

  public void withdraw(int amount) throws InsufficientBalanceException {
    if (amount > balance) {
      throw new InsufficientBalanceException("잔액이 부족합니다.");
    }
    balance -= amount;
  }
}
