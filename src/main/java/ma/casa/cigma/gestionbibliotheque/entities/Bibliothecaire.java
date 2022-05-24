package ma.casa.cigma.gestionbibliotheque.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bibliothecaire {
    @Id
    @Column(name = "id_Bilbiothecaire", nullable = false)
    @GeneratedValue
    private Long id;

    private String nom;
    private String prenom;


}
