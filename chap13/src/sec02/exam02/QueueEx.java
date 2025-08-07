package sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

// Queue를 이용한 간단한 메시지 큐룰 구현한 예제
// 먼저 넣은 메시기가 반대쪽으로 먼저 나오기 떄문에 넣는 순서대로 메시기가 처리됨
// => FIFO 
public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		// 메시지 저장
		messageQueue.offer(new Message("sendMail", "유재석"));
		messageQueue.offer(new Message("sendSMS", "송진영"));
		messageQueue.offer(new Message("sendKakaotalk", "이미주"));
		
		// 메시지 Queue가 비어있는지 확인
		while (!messageQueue.isEmpty()) {
			// 메시지 Queue에서 1개의 메시지를 꺼냄
			Message message = messageQueue.poll();
			
			switch (message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 Mail을 보냈습니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냈습니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 Kakaotalk을 보냈습니다.");
					break;
			}
		}
	}

}
