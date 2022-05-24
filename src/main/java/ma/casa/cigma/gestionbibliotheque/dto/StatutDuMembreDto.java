package ma.casa.cigma.gestionbibliotheque.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class StatutDuMembreDto implements Serializable {
    private  Long id;
    private  String permanent;
    private  String temporaire;
}
