package WeeklyQuiz.Bms;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
  private Stack<Book<T>> books;

  public BookStack() {
    books = new Stack<>();
  }

  public void pushBook(Book<T> book) {
    books.push(book);
  }

  public Book<T> popBook() throws EmptyStackException {
    if (!books.isEmpty()) {
      return books.pop();
    }
    throw new EmptyStackException();
  }

  public Book<T> peekBook() throws EmptyStackException {
    if (!books.isEmpty()) {
      return books.peek();
    }
    throw new EmptyStackException();
  }

  public boolean isEmpty() {
    return books.isEmpty();
  }
}
