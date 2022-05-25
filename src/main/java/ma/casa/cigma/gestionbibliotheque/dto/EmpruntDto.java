package ma.casa.cigma.gestionbibliotheque.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@ToString
public class EmpruntDto implements Serializable {
    private Long id;
    private LocalDateTime dateRetourTheorique;
    private  LocalDateTime dateRetourEffective;
    private int numDeRappel;

}
