package JavaStudy0619;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
  public static void main(String[] args) {
    /*Map<String, List<String>> map = new HashMap<>();
    List<String> stringList = new ArrayList<>();
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");
    map.put("홍길동", stringList);
    // map.put("홍길동", 40);

    Set<String> strings = map.keySet();
    Iterator<String> iterator = strings.iterator();
    while (iterator.hasNext()) {
      String next = iterator.next();
      List<String> list = map.get(next);
      System.out.println(list);
    }
    System.out.println(map.get("홍길동"));
    System.out.println(map.remove("홍길동"));*/

    /*Map<String, List<String>> map = new HashMap<>();
    Set<Entry<String, List<String>>> entries = map.entrySet();
    for (Entry<String, List<String>> entry : entries) {
      String key = entry.getKey();
      List<String> value = entry.getValue();
      System.out.println("\t" + key + ": " + value);
    }
    */

    Map<String, Integer> map = new HashMap<>();

    map.put("홍길동", 80);
    map.put("카리나", 85);
    map.put("제시카", 95);
    map.put("홍길동", 80); // "홍길동" 키가 같기 때문에 가장 마지막에 저장한 값으로 엎어씀
    System.out.println("총 Entry 수: " + map.size()); // 저장된 총 Entry 수 얻기

    // 2. 객체 찾기
    System.out.println("\t홍길동: " + map.get("홍길동"));
    System.out.println();

    // 3. 객체를 하나씩 처리
    Set<String> keySet = map.keySet();
    Iterator<String> iterator = keySet.iterator();
    while (iterator.hasNext()) {
      String key = iterator.next();
      Integer value = map.get(key);
      System.out.println("\t" + key + ": " + value);
    }
    System.out.println();

    // 4. 객체 삭제
    map.remove("홍길동");
    System.out.println("총 Entry 수: " + map.size());

    // 5. 객체를 하나씩 처리
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
    for (Map.Entry<String, Integer> entry : entrySet) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("\t" + key + ": " + value);
    }
    System.out.println();

    // 6. 모든 Map.Entry 삭제
    map.clear();
    System.out.println("총 Entry 수: " + map.size());
  }
}
