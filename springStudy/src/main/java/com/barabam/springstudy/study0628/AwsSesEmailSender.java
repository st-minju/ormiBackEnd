package com.barabam.springstudy.study0628;

import java.util.Calendar;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class AwsSesEmailSender implements EmailSender {

  @Override
  public void sendEmail(String to, String subject, String body) {
    // AWS SES기술을 활용한 메세지 전송 로직 구현
    System.out.println("Sending AWS SES email to " + to);
  }

  @SpringBootApplication
  public static class Main {
    public static void main(String[] args) {
      Quiz quiz = new Quiz();
      quiz.setQuestion("오늘의 날짜는?");
      quiz.setAnswer(
          Calendar.getInstance().get(Calendar.YEAR)
              + "-"
              + (Calendar.getInstance().get(Calendar.MONTH) + 1)
              + "-"
              + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
      QuizView view = new QuizView();

      QuizController quizController = new QuizController(quiz, view);
      quizController.StartQuiz();
    }
  }
}
