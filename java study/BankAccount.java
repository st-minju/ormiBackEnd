public class BankAccount {
  private String accountNumber;
  private String ownerName;
  private double balance;
  private int password;

  public BankAccount(String accountNumber, String ownerName, int password) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = 0.0;
    this.password = password;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println(ownerName + "님께서 " + amount + "원을 입금하셨습니다.");
    } else {
      System.out.println("입금할 수 없는 금액입니다.");
    }
  }

  public void withdraw(double amount, int password) {
    if (password == this.password) {
      if (amount > 0 && balance >= amount) {
        balance -= amount;
        System.out.println(ownerName + "님께서 " + amount + "원을 출금하셨습니다.");
      } else {
        System.out.println("출금에 실패하셨습니다.");
      }
    } else {
      System.out.println("잘못된 패스워드입니다.");
    }
  }

  public void printBalance() {
    System.out.println("현재 " + ownerName + "님의 통장 잔액은 " + balance + "원 입니다.");
  }
}
