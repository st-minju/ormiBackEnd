package WeeklyQuiz.Bms;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
  private List<Book<T>> books;

  public BookShelf() {
    books = new ArrayList<>();
  }

  public List<Book<T>> getBooks() {
    return books;
  }

  @Override
  public void addBook(Book<T> book) {
    books.add(book);
  }

  @Override
  public void removeBook(Book<T> book) {
    for (Book<T> list : books) {
      if (list.getTitle().equals(book.getTitle())
          && list.getAuthor().equals(book.getAuthor())
          && list.getIdentifier().equals(book.getIdentifier())) {
        books.remove(list);
        break;
      }
    }
  }

  @Override
  public List<Book<T>> searchByTitle(String title) {
    List<Book<T>> sameTitle = new ArrayList<>();
    for (Book<T> book : books) {
      if (book.getTitle().toLowerCase().contains(title)) sameTitle.add(book);
    }
    return sameTitle;
  }

  @Override
  public List<Book<T>> searchByAuthor(String author) {
    List<Book<T>> sameAuthor = new ArrayList<>();
    for (Book<T> book : books) {
      if (book.getAuthor().toLowerCase().contains(author)) sameAuthor.add(book);
    }
    return sameAuthor;
  }
}
