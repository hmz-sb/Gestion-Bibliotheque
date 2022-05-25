package ma.casa.cigma.gestionbibliotheque.web;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.errors.BibliRunTimeException;
import ma.casa.cigma.gestionbibliotheque.jwt.JwtUtils;
import ma.casa.cigma.gestionbibliotheque.mapping.AdhernetMapping;
import ma.casa.cigma.gestionbibliotheque.service.AdhernetService;
import ma.casa.cigma.gestionbibliotheque.web.dto.AdhernetListResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/Adhenet")
public class AdhernetController {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    AdhernetService adhernetService;

    @Autowired
    MessageSource messageSource;
    @Autowired
    AdhernetMapping adhernetMapping;


    @PostMapping(value = "/list")
    public AdhernetListResponseDTO getAllAdhernet () {
        AdhernetListResponseDTO result = new AdhernetListResponseDTO();
        try {

            List<AdhernetDto> adhernetDtoList = adhernetService.getAllAdhernet();
            result.setAdhernetDtoList(adhernetDtoList);
            result.setCode(HttpStatus.OK.toString());
            result.setMessage(messageSource.getMessage("adhernet.list.message.success", new Object[]{}, Locale.getDefault()));

        }catch(BibliRunTimeException e) {

            result.setCode(e.getHttpStatus().toString());
            result.setMessage(e.getMessage());
        }catch (Exception e) {
            result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
            result.setMessage(messageSource.getMessage("adhernet.list.message.failure", new Object[]{}, Locale.getDefault()));
        }
        return result;
    }

    @PostMapping("/add")
    public ResponseEntity<Adhernet> addAdhernet(@RequestBody AdhernetDto adhernetDto){
        return new ResponseEntity<Adhernet>( adhernetService.addAdhernet(new Adhernet()),HttpStatus.OK);
    }




}


