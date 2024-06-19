package JavaStudy0619;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
  public static void main(String[] args) {
    Queue<Message> messageQueue = new LinkedList<>();

    messageQueue.offer(new Message("sendMail", "홍길동"));
    messageQueue.offer(new Message("sendSms", "제니"));
    messageQueue.offer(new Message("sendKakaoTalk", "리사"));
    messageQueue.offer(new Message("sendDm", "지수"));
    messageQueue.offer(new Message("sendLine", "로제"));

    while (!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      switch (message.getCommand()) {
        case "sendMail":
          System.out.println(message.getTo() + "에게 메일을 보냅니다.");
          break;
        case "sendSms":
          System.out.println(message.getTo() + "에게 문자를 보냅니다.");
          break;
        case "sendKakaoTalk":
          System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
          break;
        default:
          System.out.println(message.getTo() + "에게 아무거나 보냅니다.");
          break;
      }
    }
  }
}
