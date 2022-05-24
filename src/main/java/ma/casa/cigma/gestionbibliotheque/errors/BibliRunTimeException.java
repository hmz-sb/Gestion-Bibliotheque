package ma.casa.cigma.gestionbibliotheque.errors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
public class BibliRunTimeException extends RuntimeException{

    private HttpStatus httpStatus;

    private String message;
}
