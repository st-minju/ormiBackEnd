package JavaStudy0617;

public class ProfileDBRepository implements ProfileRepository {
  @Override
  public void save() {
    System.out.println("DB에 저장");
  }
}
