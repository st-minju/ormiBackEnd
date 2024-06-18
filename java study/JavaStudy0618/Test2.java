package JavaStudy0618;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {

  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    /* arrayList.add("홍길동");
    arrayList.add("홍길동2");
    arrayList.add("홍길동2");
    arrayList.add("홍길동2");
    arrayList.add("홍길동3");
    arrayList.add("홍길동4");
    arrayList.add("홍길동5");


    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
    arrayList.removeIf((s) -> s.equals("홍길동2"));
    System.out.println("=========");
    for (String str : arrayList) {
      System.out.println(str);
    }*/

    /*arrayList.add("Java");
    arrayList.add("Spring");
    arrayList.add("Servelet/JSP");
    arrayList.add("DBMS");
    arrayList.add("JPA");

    System.out.println("총 객체수 : " + arrayList.size());
    System.out.println("두번째 인덱스 : " + arrayList.get(2));
    for (String s : arrayList) {
      System.out.println(s);
    }*/

    List<String> linkList = new LinkedList<>();

    long startTime, endTime;
    startTime = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      arrayList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("arrayList 걸린시간: " + (endTime - startTime));
    System.out.println("==========");
    startTime = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      linkList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("linkList 걸린시간: " + (endTime - startTime));
  }
}
