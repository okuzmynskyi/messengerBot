package org.messenger.hooker.models;


import lombok.*;
import org.messenger.hooker.models.viber.Message;
import org.messenger.hooker.models.viber.Sender;
import org.messenger.hooker.models.viber.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data

public class IncomingMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", insertable = false, updatable = false)
    private int id;

    @NotNull
    private String event;
    private String timestamp;
    private String chat_hostname;
    private long message_token;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn
    private Sender sender;
    private String type;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn
    private User user;


    private Boolean subscribed;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn
    private Message message;


}

