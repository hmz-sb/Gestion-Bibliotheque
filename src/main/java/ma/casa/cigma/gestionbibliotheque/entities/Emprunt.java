package ma.casa.cigma.gestionbibliotheque.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emprunt {

    @Id
    @Column(name = "id_Emprunt", nullable = false)
    @GeneratedValue
    private Long id;

    private LocalDateTime dateRetourTheorique;
    private LocalDateTime dateRetourEffective;
    private int numDeRappel;


}
