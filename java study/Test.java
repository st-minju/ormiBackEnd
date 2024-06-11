import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    /*Person person1 = new Person("김민주", 01021211212, 50000, 25);
    person1.sayHello();
    person1.sayMoney();
    Person person2 = new Person("Molly", 01012122121, 500000000, 35);
    person2.sayHello();
    person2.sayMoney();

    Student student = new Student();
    person1.teaching(student);
    person1.cheating(student);
    person1.cheating(student);*/

    Scanner sc = new Scanner(System.in);

    // 계좌 생성
    System.out.print("계좌번호를 입력하새요: ");
    String accountNumber = sc.nextLine();
    System.out.print("소유자 이름을 입력하세요: ");
    String ownerName = sc.nextLine();
    System.out.print("게좌 비밀번호를 입력하세요: ");
    int password = sc.nextInt();
    sc.nextLine();
    BankAccount account = new BankAccount(accountNumber, ownerName, password);

    // 입금 및 출금
    account.deposit(1010000); // 예시 입금
    System.out.print("게좌 비밀번호를 입력하세요: ");
    int passwordConfirm = sc.nextInt();
    account.withdraw(50000, passwordConfirm); // 예시 출금
    System.out.print("게좌 비밀번호를 입력하세요: ");
    passwordConfirm = sc.nextInt();
    account.withdraw(100000000, passwordConfirm); // 예시 출금
    System.out.print("게좌 비밀번호를 입력하세요: ");
    passwordConfirm = sc.nextInt();
    account.withdraw(30000, passwordConfirm); // 예시 출금

    // 잔액 조회
    account.printBalance();

    sc.close();
  }
}
