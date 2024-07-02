package com.barabam.springstudy.study0628;

import java.util.Scanner;

public class QuizView {

  public void displayQuestion(String question) {
    System.out.println(question);
  }

  public String getUserAnswer() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("답변을 입력하세요.");
    String answer = scanner.nextLine();

    scanner.close();

    return answer;
  }

  public void displayResult(boolean isCorrect) {
    System.out.println(isCorrect ? "정답입니다!" : "오답입니다.");
  }
}
