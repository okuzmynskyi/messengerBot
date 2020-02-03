package org.messenger.hooker.models.viber;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import org.messenger.hooker.models.IncomingMessage;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@EqualsAndHashCode(exclude = "incomingBooks")
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName("")
    private int id;

    @Id
    @SerializedName("id")
    private String uuid;
    private String name;
    private String avatar;
    private String language;
    private String country;
    private String api_version;

    @OneToMany(mappedBy="user")
    private List<IncomingMessage> incomingMessageList = new ArrayList<>();

    public String getId() {
        return uuid;
    }


    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                ", api_version='" + api_version + '\'' +
                '}';
    }
}


