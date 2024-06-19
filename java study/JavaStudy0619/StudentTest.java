package JavaStudy0619;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentTest {
  public static void main(String[] args) {
    Map<Student, Integer> map = new HashMap<>();
    map.put(new Student("홍길동", 1), 80);
    map.put(new Student("카리나", 2), 70);
    map.put(new Student("윈터", 3), 75);
    map.put(new Student("장원영", 4), 90);

    Set<Entry<Student, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
    for (Entry<Student, Integer> entry : entrySet) {
      String name = entry.getKey().getName();
      int no = entry.getKey().getNo();
      Integer value = entry.getValue();
      System.out.println("\t<" + name + ", " + no + "> : " + value);
    }
    System.out.println();
  }
}
