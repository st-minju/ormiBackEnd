package DailyQuiz;

public class DailyRoutine {
  public static void main(String[] args) {
    Diary diary = new Diary();
    try {
      diary.writing(40);
      diary.writing(70);
    } catch (NoMorePaperException e) {
      System.out.println(e.getMessage());
    }
  }
}
