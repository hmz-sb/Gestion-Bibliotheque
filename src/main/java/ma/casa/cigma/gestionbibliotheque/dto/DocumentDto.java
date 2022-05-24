package ma.casa.cigma.gestionbibliotheque.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ma.casa.cigma.gestionbibliotheque.entities.EtatDuDocument;
import ma.casa.cigma.gestionbibliotheque.entities.TypeDuDocument;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DocumentDto implements Serializable {
    private  Long id;
    private EtatDuDocument etatDuDocument;
    private TypeDuDocument typeDuDocument;
}
