package io.javabrains.productservice.rabbitmqConsumer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
//import org.springframework.boot.context.event.ApplicationReadyEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Component
public class MessageListener {

	private static List<String> messageList = new ArrayList<String>();

	@RabbitListener(queues = MQConfig.QUEUE)
	public void listener(CustomMessage message) {
		try {
		notifications(message);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public void notifications(CustomMessage message) {
		StringBuilder str = new StringBuilder(message.getMessage());
		str.append("\n ").append(message.getMessageDate());
		messageList.add(str.toString());

	}

	public static List<String> getMessageList() {
		return messageList;
	}

	public static void setMessageList(List<String> messageList) {
		MessageListener.messageList = messageList;
	}
	

}
