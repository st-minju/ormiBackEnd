package DailyQuiz;

public class Diary {
  private int paper = 100;

  public void writing(int howMany) throws NoMorePaperException {
    if (paper - howMany < 0) {
      throw new NoMorePaperException("일기를 쓰기에는 종이가 부족해요ㅠㅠ");
    }
    paper -= howMany;
    System.out.println("일기쓰기 성공! 이제 다이어리가 " + paper + "장 남았어요!");
  }
}
