package com.barabam.springstudy;

public interface EmailSender {
  public void sendEmail(String to, String subject, String body);
}
