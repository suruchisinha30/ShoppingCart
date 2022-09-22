package io.javabrains.profileserviceapp;

import io.javabrains.profileserviceapp.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.CrossOrigin;

//import javax.annotation.PostConstruct;
//import javax.mail.MessagingException;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

@SpringBootApplication

public class ProfileServiceAppApplication {
	@Autowired
	private EmailSenderService senderService;
//	@Autowired
//	private ProfileRepository profileRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceAppApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendEmail("suruchisinha.3011@gmail.com",
				"Account Creation",
				"Congratulations on creating your account");
	}


}
