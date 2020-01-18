package org.messenger.hooker.models.viber;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


@NoArgsConstructor
public class OutgoingMessage {
    private String receiver;
    @Value("${viber.minapi_version}")
    String min_api_version;

    @Autowired
    private Sender sender;
    private String tracking_data;
    private String type;
    private String text;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMin_api_version() {
        return min_api_version;
    }

    public void setMin_api_version(String min_api_version) {
        this.min_api_version = min_api_version;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getTracking_data() {
        return tracking_data;
    }

    public void setTracking_data(String tracking_data) {
        this.tracking_data = tracking_data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "OutgoingMessage{" +
                "receiver='" + receiver + '\'' +
                ", min_api_version='" + min_api_version + '\'' +
                ", sender=" + sender +
                ", tracking_data='" + tracking_data + '\'' +
                ", type='" + type + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
