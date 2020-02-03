package org.messenger.hooker.models.viber;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.messenger.hooker.models.IncomingMessage;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Message {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Id
    private String text;
    private String type;
    @OneToMany(mappedBy = "message")
    private List<IncomingMessage> incomingMessageList = new ArrayList<>();

}
