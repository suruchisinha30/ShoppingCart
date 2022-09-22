package io.javabrains.productservice.rabbitmqConsumer;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class ListenerController {
		
	@GetMapping(value = "/notification", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity <List<String>> getnNotification() {
			return ResponseEntity.ok (MessageListener.getMessageList());

  }

}
