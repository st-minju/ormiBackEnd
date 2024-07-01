package com.barabam.springstudy;

public class SmtpEmailSender implements EmailSender {

  @Override
  public void sendEmail(String to, String subject, String body) {
    // Smtp기술을 활용한 메세지 전송 로직 구현
    System.out.println("Sending Smtp email to " + to);
  }
}
