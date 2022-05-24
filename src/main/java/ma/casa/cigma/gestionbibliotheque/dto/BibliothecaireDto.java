package ma.casa.cigma.gestionbibliotheque.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class BibliothecaireDto implements Serializable {
    private Long id;
    private  String nom;
    private  String prenom;
}
