package ma.casa.cigma.gestionbibliotheque.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper=false)
public class StatutDuMembre extends Adhernet {
    @Id
    @Column(name = "id_Statutmembre")
    @GeneratedValue
    private Long id;

    private String permanent;
    private String temporaire;



}
