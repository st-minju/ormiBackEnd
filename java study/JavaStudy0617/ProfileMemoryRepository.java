package JavaStudy0617;

public class ProfileMemoryRepository implements ProfileRepository {
  @Override
  public void save() {
    System.out.println("메모리에 저장");
  }
}
