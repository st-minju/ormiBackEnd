package WeeklyQuiz.Bms;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BookStack<Integer> bookStack = new BookStack<>();
    BookShelf<String> bookShelf = new BookShelf<>();

    Scanner scanner = new Scanner(System.in);

    // 책 등록
    for (int i = 0; i < 5; i++) {
      System.out.print("책 제목을 입력하세요: ");
      String bookTitle = scanner.nextLine();
      System.out.print("책의 저자를 입력하세요: ");
      String bookAuthor = scanner.nextLine();
      System.out.print("책의 식별자를 정수로 입력하세요 (ex.0000) : ");
      int bookIntegerIdentifier = scanner.nextInt();
      scanner.nextLine();
      String bookStringIdentifier = Integer.toString(bookIntegerIdentifier);
      System.out.println("===========");

      Book<Integer> bookInteger = new Book<>(bookTitle, bookAuthor, bookIntegerIdentifier);
      Book<String> bookString = new Book<>(bookTitle, bookAuthor, bookStringIdentifier);

      bookStack.pushBook(bookInteger);
      bookShelf.addBook(bookString);
    }

    System.out.println("< 책장에 있는 책 전체 출력 >");
    printString(bookShelf.getBooks());
    System.out.println("===========");

    System.out.println("'자바바라'가 없는 경우 삭제 메서드 실행");
    bookShelf.removeBook(new Book<>("자바바라", "None", "0006"));

    System.out.println("< 책장에 있는 책 전체 출력 >");
    printString(bookShelf.getBooks());
    System.out.println("===========");

    bookShelf.addBook(new Book<>("자바바라", "None", "0006"));
    System.out.println("< 책장에 있는 책 전체 출력 >");
    printString(bookShelf.getBooks());
    System.out.println("===========");

    System.out.println("'자바바라'가 있는 경우 삭제 메서드 실행");
    bookShelf.removeBook(new Book<>("자바바라", "None", "0006"));

    System.out.println("< 책장에 있는 책 전체 출력 >");
    printString(bookShelf.getBooks());
    System.out.println("===========");

    while (true) {
      System.out.println("도서 제목과 저자 중 어떤 것으로 검색하시겠습니까? (검색을 끝내시려면 '끝'을 입력하세요.)");
      String whichData = scanner.nextLine();
      System.out.println("");
      if (whichData.equals("끝")) {
        break;
      }
      switch (whichData) {
        case "도서 제목", "도서제목", "제목":
          System.out.print("검색하실 도서 제목을 입력하세요: ");
          String searchTitle = scanner.nextLine();
          printString(bookShelf.searchByTitle(searchTitle));
          System.out.println("===========");
          break;
        case "저자", "작가":
          System.out.print("검색하실 저자의 이름을 입력하세요: ");
          String searchAuthor = scanner.nextLine();
          printString(bookShelf.searchByAuthor(searchAuthor));
          System.out.println("===========");
          break;
        default:
          System.out.println("검색하고자 하는 카테고리를 다시 입력하세요.");
          System.out.println("===========");
          break;
      }
    }
    Book<Integer> book = bookStack.popBook();
    System.out.println("< bookStack.popBook() 결과 >");
    printString(book);
    System.out.println("===========");

    book = bookStack.peekBook();
    System.out.println("< bookStack.peakBook() 결과 >");
    printString(book);
    System.out.println("===========");

    System.out.println("bookStack.isEmpty(): " + bookStack.isEmpty());

    scanner.close();
  }

  // 결과를 출력할 때 더 깔끔하게 보여주기 위한 패턴
  // 매번 중복 입력하지 않고 출력하기 위한 메서드
  static <T> void printString(List<Book<String>> books) {
    for (Book<String> book : books) {
      String str =
          "{ 도서 제목: "
              + book.getTitle()
              + ", 저자: "
              + book.getAuthor()
              + ", 식별자: "
              + book.getIdentifier()
              + " }";
      System.out.println(str);
    }
  }

  // 오버로딩
  static <T> void printString(Book<Integer> book) {
    String str =
        "{ 도서 제목: "
            + book.getTitle()
            + ", 저자: "
            + book.getAuthor()
            + ", 식별자: "
            + book.getIdentifier()
            + " }";
    System.out.println(str);
  }
}
