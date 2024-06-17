package JavaStudy0617.generic;

public class Car<T> {
  private T t;

  public T get() {
    return t;
  }

  public void set(T t) {
    this.t = t;
  }
}
