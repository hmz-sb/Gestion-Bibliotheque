package ma.casa.cigma.gestionbibliotheque.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter @Getter
public class User {

    @Id
    private long id;
    private String username;
    private String password;

    @ManyToMany
    @JoinColumn
    private List<Role> roles=new ArrayList<Role>();
}
