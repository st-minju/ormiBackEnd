package com.barabam.springstudy.study0628;

public interface EmailSender {
  public void sendEmail(String to, String subject, String body);
}
