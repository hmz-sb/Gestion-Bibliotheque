package ma.casa.cigma.gestionbibliotheque.web;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.DocumentDto;
import ma.casa.cigma.gestionbibliotheque.errors.BibliRunTimeException;
import ma.casa.cigma.gestionbibliotheque.jwt.JwtUtils;
import ma.casa.cigma.gestionbibliotheque.service.AdhernetService;
import ma.casa.cigma.gestionbibliotheque.service.DocumentService;
import ma.casa.cigma.gestionbibliotheque.web.dto.AdhernetListResponseDTO;
import ma.casa.cigma.gestionbibliotheque.web.dto.DocumentListResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/Document")
public class DocumentController {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    DocumentService documentService;

    @Autowired
    MessageSource messageSource;


    @PostMapping(value = "/list")
    public DocumentListResponseDTO getAllDocument () {
        DocumentListResponseDTO result = new DocumentListResponseDTO();
        try {

            List<DocumentDto> documentDtoList = documentService.getAllDocument();
            result.setDocumentDtoList(documentDtoList);
            result.setCode(HttpStatus.OK.toString());
            result.setMessage(messageSource.getMessage("document.list.message.success", new Object[]{}, Locale.getDefault()));

        }catch(BibliRunTimeException e) {

            result.setCode(e.getHttpStatus().toString());
            result.setMessage(e.getMessage());
        }catch (Exception e) {
            result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
            result.setMessage(messageSource.getMessage("document.list.message.failure", new Object[]{}, Locale.getDefault()));
        }
        return result;
    }
}
