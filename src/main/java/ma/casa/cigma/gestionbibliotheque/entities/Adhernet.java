package ma.casa.cigma.gestionbibliotheque.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Adhernet {
    @Id
    @Column(name = "id_Adhernet", nullable = false)
    @GeneratedValue
    private Long id;

    private String nom;
    private String prenom;
    private Date dateInscription;

    private  int numEmprunteEnCour;
    private int numDeReservation;

    @ManyToOne
    @JoinColumn
    private  StatutDuMembre statutDuMembre;

    public String getNom() {
        return nom;
    }

}
