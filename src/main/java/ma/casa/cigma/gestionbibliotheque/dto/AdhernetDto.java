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
public class AdhernetDto implements Serializable {
    private  Long id;
    private  String nom;
    private  String prenom;
    private  Date dateInscription;
    private  int numEmprunteEnCour;
    private int numDeReservation;
}
