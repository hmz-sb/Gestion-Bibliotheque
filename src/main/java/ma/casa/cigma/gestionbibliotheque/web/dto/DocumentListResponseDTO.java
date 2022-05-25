package ma.casa.cigma.gestionbibliotheque.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ma.casa.cigma.gestionbibliotheque.dto.DocumentDto;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@ToString
public class DocumentListResponseDTO implements Serializable {

    private List<DocumentDto> documentDtoList;

    private String message;

    private String code;
}
