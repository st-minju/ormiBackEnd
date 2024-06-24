package WeeklyQuiz.Bms;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
  private Stack<Book<T>> books;

  public BookStack() {
    books = new Stack<>(); // 빈 스택 초기화
  }

  // 도서 추가
  public void pushBook(Book<T> book) {
    books.push(book); // 스택 메서드 이용하여 객체 추가
  }

  // 마지막에 들어간 도서 삭제 및 출력
  public Book<T> popBook() throws EmptyStackException {
    // 스택이 비어있지 않으면
    if (!books.isEmpty()) {
      // 스택 메서드 이용하여 마지막으로 들어온 객체 삭제 및 출력
      return books.pop();
    }
    // 스택이 비어있으면 Exception을 던짐
    throw new EmptyStackException();
  }

  // 맨 마지막 자리에 있는 도서 출력
  public Book<T> peekBook() throws EmptyStackException {
    // 스택이 비어있지 않으면
    if (!books.isEmpty()) {
      // 스택 메서드 이용하여 가장 끝에 있는 객체 출력
      return books.peek();
    }
    // 스택이 비어있으면 Exception을 던짐
    throw new EmptyStackException();
  }

  // 스택이 비어있는지 여부 확인
  public boolean isEmpty() {
    // 스택이 비어있으면 true, 그렇지 않으면 false를 반환
    return books.isEmpty();
  }
}
