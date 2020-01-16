package org.messenger.hooker;

import org.messenger.hooker.handler.MessageHandler;
import org.messenger.hooker.handler.ResponseHandler;
import org.messenger.hooker.models.viber.IncomingMessage;
import org.messenger.hooker.models.viber.OutgoingMessage;
import org.messenger.hooker.models.viber.Sender;
import org.messenger.hooker.models.viber.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HookerContextConfiguration {

    @Bean(name = "user")
    public User getUser() {
        return new User();
    }

    @Bean(name = "sender")
    public Sender getSender() {
        return new Sender();
    }

    @Bean(name = "outgoingMessage")
    public OutgoingMessage getOutgoingMessage() {
        return new OutgoingMessage();
    }

    @Bean(name = "incomingMessage")
    public IncomingMessage getIncomingMessage() {
        return new IncomingMessage();
    }


    @Bean(name = "messageHandler")
    public MessageHandler getMessageHandler() {
        return new MessageHandler();
    }

    @Bean(name = "responseHandler")
    public ResponseHandler getResponseHandler() {
        return new ResponseHandler();
    }

    @Bean(name = "restTemplate")
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
