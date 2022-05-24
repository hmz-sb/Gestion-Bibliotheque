package ma.casa.cigma.gestionbibliotheque.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter @Getter @ToString
public class RoleDto implements Serializable {
    private  int id;
    private  String role;
}
