package ma.casa.cigma.gestionbibliotheque.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class AdhernetListResponseDTO implements Serializable {

    private List<AdhernetDto> adhernetDtoList;
    private String message;

    private String code;
}
