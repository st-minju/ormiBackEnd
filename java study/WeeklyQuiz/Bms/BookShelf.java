package WeeklyQuiz.Bms;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
  private List<Book<T>> books;

  public BookShelf() {
    books = new ArrayList<>(); // 빈 리스트 객체 초기화
  }

  public List<Book<T>> getBooks() {
    return books;
  }

  // 메소드 오버라이드로 매개변수로 전달받은 도서를 books에 추가
  @Override
  public void addBook(Book<T> book) {
    books.add(book); // 리스트에 객체 추가
  }

  // 메소드 오버라이드로 매개변수로 전달받은 도서를 books에서 삭제
  @Override
  public void removeBook(Book<T> book) {
    // 리스트에서 객체 하나씩 출력
    for (Book<T> list : books) {
      // 출력한 객체와 매개변수 객체가 일치하는지 확인
      if (list.getTitle().equals(book.getTitle())
          && list.getAuthor().equals(book.getAuthor())
          && list.getIdentifier().equals(book.getIdentifier())) {
        // 매개변수와 일치하는 객체가 있으면 해당 객체를 리스트에서 삭제
        books.remove(list);
        // 동일한 객체는 1개이므로 삭제가 되었으면 반복문 종료
        break;
      }
    }
  }

  // 메소드 오버라이드로 도서 제목에서 일치하는 부분 문자열 존재 시 검색
  @Override
  public List<Book<T>> searchByTitle(String title) {
    // 일치하는 문자열이 존재하는 도서 객체를 담을 리스트 선언
    List<Book<T>> sameTitle = new ArrayList<>();

    // 리스트에서 객체 하나씩 출력
    for (Book<T> book : books) {
      // 객체에서 제목을 추출하고 대소문자 구분 없이 비교하기 위해 전체를 소문자로 바꾸어 비교
      if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
        // 매개변수와 일치하는 객체가 있으면 해당 객체를 리스트에 추가
        sameTitle.add(book);
      }
    }
    return sameTitle;
  }

  // 메소드 오버라이드로 저자에서 일치하는 부분 문자열 존재 시 검색
  @Override
  public List<Book<T>> searchByAuthor(String author) {
    // 일치하는 문자열이 존재하는 도서 객체를 담을 리스트
    List<Book<T>> sameAuthor = new ArrayList<>();

    // 리스트에서 객체 하나씩 출력
    for (Book<T> book : books) {
      // 객체에서 저자를 추출하고 대소문자 구분 없이 비교하기 위해 전체를 소문자로 바꾸어 비교
      if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
        // 매개변수와 일치하는 객체가 있으면 해당 객체를 리스트에 추가
        sameAuthor.add(book);
      }
    }
    return sameAuthor;
  }
}
