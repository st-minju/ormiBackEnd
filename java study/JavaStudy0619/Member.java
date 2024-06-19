package JavaStudy0619;

public class Member {

  private String name;
  private int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    /*if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Member member = (Member) o;
      return age == member.age && Objects.equals(name, member.name);
    */
    if (o instanceof Member) {
      Member member = (Member) o;
      return member.name.equals(this.name) && member.age == this.age;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    // return Objects.hash(name, age);
    int i = name.hashCode() + age;
    System.out.println(i);
    return i;
  }
}
