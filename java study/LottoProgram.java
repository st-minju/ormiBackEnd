import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LottoProgram {
  /** 2024-06-05 random class */
  public static void main(String[] args) {
    Random random = new Random();
    ArrayList<Integer> lotto = new ArrayList<Integer>(6);
    while (lotto.size() < 6) {
      int num = random.nextInt(45) + 1;
      if (!lotto.contains(num)) {
        lotto.add(num);
      }
    }
    Collections.sort(lotto);
    System.out.println(lotto);
  }
}
