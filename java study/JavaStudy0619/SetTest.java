package JavaStudy0619;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
  public static void main(String[] args) {

    /*Set<String> stringSet = new HashSet<>();

    stringSet.add("Java");
    stringSet.add("Spring");
    stringSet.add("JSP");
    stringSet.add("Java");
    stringSet.add("DBMS");

    System.out.println(stringSet.size());

    stringSet.remove("Java");

    Iterator<String> iterator = stringSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    //    stringSet.clear();

    if (stringSet.isEmpty()) {
      System.out.println("비었습니다.");
    } else {
      System.out.println("비지 않았습니다.");
    }*/

    Set<Member> memberSet = new HashSet<>();

    memberSet.add(new Member("홍길동", 20));
    memberSet.add(new Member("홍길동", 30));

    System.out.println("총 객체 수: " + memberSet.size());
  }
}
