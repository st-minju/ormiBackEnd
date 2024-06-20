package JavaStudy0620;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
  public static void main(String[] args) throws InterruptedException {
    /*MyThread myThread1 = new MyThread("스레드1");
    MyThread myThread2 = new MyThread("스레드2");
    MyThread myThread3 = new MyThread("스레드3");
    MyThread myThread4 = new MyThread("스레드4");
    MyThread myThread5 = new MyThread("스레드5");

    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();
    myThread5.start();*/

    /*Thread thread1 = new Thread(new MyRunnable(1));
    Thread thread2 = new Thread(new MyRunnable(2));
    Thread thread3 = new Thread(new MyRunnable(3));
    Thread thread4 = new Thread(new MyRunnable(4));
    Thread thread5 = new Thread(new MyRunnable(5));

    thread1.start();
    thread2.start();
    thread3.sleep(10000);
    thread3.start();
    thread4.start();
    thread5.start();*/

    /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    callList(list);*/

    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    numbers.removeIf((integer) -> integer % 2 == 0);

    /* Iterator<Integer> iterator = numbers.iterator();

    while (iterator.hasNext()) {
      Integer next = iterator.next();
      if(next % 2 == 0) {
        iterator.remove();
      }
    }*/
    System.out.println(numbers);
  }

  public static void callList(List<Integer> integerList) {
    for (int i : integerList) {
      System.out.println(i);
    }
  }
}
