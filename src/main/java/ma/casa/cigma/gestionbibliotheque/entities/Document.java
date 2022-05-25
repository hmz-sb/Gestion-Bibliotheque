package ma.casa.cigma.gestionbibliotheque.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {
    @Id
    @Column(name = "id_Document")
    @GeneratedValue
    private Long id;



    @JoinColumn
    private Class<InformationDuDocument> informationDuDocument;

    @JoinColumn
    private EtatDuDocument etatDuDocument;



    @JoinColumn
    private Class<TypeDuDocument> typeDuDocument;

}
