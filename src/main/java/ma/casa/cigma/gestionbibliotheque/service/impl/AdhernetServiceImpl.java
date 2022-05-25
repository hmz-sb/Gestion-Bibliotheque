package ma.casa.cigma.gestionbibliotheque.service.impl;

import ma.casa.cigma.gestionbibliotheque.domaine.UserConverter;
import ma.casa.cigma.gestionbibliotheque.domaine.UserVo;
import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.StatutDuMembre;
import ma.casa.cigma.gestionbibliotheque.entities.User;
import ma.casa.cigma.gestionbibliotheque.errors.BibliRunTimeException;
import ma.casa.cigma.gestionbibliotheque.errors.BusinessException;
import ma.casa.cigma.gestionbibliotheque.mapping.AdhernetMapping;
import ma.casa.cigma.gestionbibliotheque.repository.AdhernetRepository;
import ma.casa.cigma.gestionbibliotheque.repository.StatutDuMembreRepository;
import ma.casa.cigma.gestionbibliotheque.service.AdhernetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@Service
@Transactional
public class AdhernetServiceImpl implements AdhernetService {


    @Autowired
    AdhernetRepository adhernetRepository;

    @Autowired
    StatutDuMembreRepository statutDuMembreRepository;

    @Autowired
    AdhernetMapping adhernetMapping;

    @Autowired
    MessageSource messageSource;


    @Override
    public Adhernet addAdhernet(Adhernet adhernet) {
        return adhernetRepository.save(adhernet);
    }

    @Override
    public AdhernetDto findByNom(String adhernet) {

       return adhernetRepository.findByNom(adhernet);

    }


    public StatutDuMembre getByStatut(Long id) {
        return (StatutDuMembre) statutDuMembreRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public List<AdhernetDto> getAllAdhernet() {

        List<Adhernet> adhernetList = adhernetRepository.findAll();

        if (CollectionUtils.isEmpty(adhernetList)) {
            throw new BibliRunTimeException(HttpStatus.BAD_REQUEST, messageSource.getMessage("adhernet.list.is.empty",
                    new Object[]{}, Locale.getDefault()));
        }

        List<AdhernetDto> adhernetDtoList = new ArrayList<>();
        adhernetList.stream().forEach(adhernet ->
        {
            AdhernetDto adhernetDto = adhernetMapping.adhernetDtoToBo(adhernet);
            adhernetDtoList.add(adhernetDto);
        });
        return adhernetDtoList;
    }
}
