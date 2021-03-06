package ma.casa.cigma.gestionbibliotheque.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class InformationDuDocumentDto implements Serializable {
    private  Long id;
    private String titre;
    private  String auteur;
    private Date dateDeParution;
    private  String resume;
}
