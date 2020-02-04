package org.messenger.hooker.controllers;


import com.google.gson.Gson;
import org.messenger.hooker.database.IncomingMessageRepository;
import org.messenger.hooker.handler.TelegramSenderHandler;
import org.messenger.hooker.handler.ViberMessageProcessor;
import org.messenger.hooker.models.IncomingMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.annotation.WebListener;

@RestController
@RequestMapping("api")
@WebListener
@Transactional
public class ReceiverController {

    @Value("${spring.profiles.active}")
    private String profile;

    @Autowired
    ViberMessageProcessor viberMessageProcessor;

    @Autowired
    TelegramSenderHandler telegramSenderHandler;

    @Autowired // This means to get the bean called userRepository
    private IncomingMessageRepository incomingMessageRepository;

    private IncomingMessage incomingMessage;

    @RequestMapping("/")
    public String CommonHandler(@RequestBody String body) {


        telegramSenderHandler.setBody(body).logSend("Request is :");
        Gson gson = new Gson();
        incomingMessage = new IncomingMessage();
        incomingMessage = gson.fromJson(body, IncomingMessage.class);
        incomingMessageRepository.save(incomingMessage);
        incomingMessageRepository.save(incomingMessage);
        viberMessageProcessor.setMessage(incomingMessage);
        viberMessageProcessor.startProcess();

        return "";
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct out : +++>>>  " + profile);
    }


}
