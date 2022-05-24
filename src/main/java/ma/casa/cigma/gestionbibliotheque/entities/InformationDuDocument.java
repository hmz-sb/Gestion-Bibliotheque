package ma.casa.cigma.gestionbibliotheque.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper=false)
public class InformationDuDocument extends Document {
    @Id
    @Column
    @GeneratedValue
    private Long id;

    private String titre;
    private String auteur;
    private Date dateDeParution;
    private String resume;


}
