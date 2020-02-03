package org.messenger.hooker.models.viber;

import com.google.gson.annotations.SerializedName;
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
public class Sender {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName("")
    private int id;

    public String getId() {
        return uuid;
    }

    @Id
    @SerializedName("id")
    private String uuid;

    private String name;
    private String avatar;
    private String language;
    private String country;
    @SerializedName("api_version")
    private String apiVersion;

    public Sender(String name, String avatar) {
        this.name = name;
        this.avatar = avatar;
    }

    @OneToMany(mappedBy = "sender")
    private List<IncomingMessage> incomingMessageList = new ArrayList<>();


    @Override
    public String toString() {
        return "Sender{" +
                "Name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
