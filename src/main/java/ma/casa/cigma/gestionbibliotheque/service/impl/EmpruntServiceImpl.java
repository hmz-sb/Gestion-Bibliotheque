package ma.casa.cigma.gestionbibliotheque.service.impl;

import ma.casa.cigma.gestionbibliotheque.dto.EmpruntDto;
import ma.casa.cigma.gestionbibliotheque.entities.EtatDuDocument;
import ma.casa.cigma.gestionbibliotheque.mapping.EmpruntMapping;
import ma.casa.cigma.gestionbibliotheque.repository.EmpruntRepository;
import ma.casa.cigma.gestionbibliotheque.service.EmpruntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;

@Service
@Transactional
public class EmpruntServiceImpl implements EmpruntService {

    @Autowired
    EmpruntRepository empruntRepository;

    @Autowired
    EmpruntMapping empruntMapping;
    @Autowired
    MessageSource messageSource;

    public LocalDateTime renouvelLePret(LocalDateTime date) {

        return LocalDateTime.now();
    }

    @Override
    public EmpruntDto verifierDATErETOUR(Date date) {
        return null;
    }

    @Override
    public EmpruntDto enCours(Date date) {
        return null;
    }

    @Override
    public EmpruntDto faireEmprunt(Date date) {
        return null;
    }

    @Override
    public EmpruntDto finaliserEmprunt(Date date) {
        return null;
    }

    @Override
    public EmpruntDto siDocumentEmpruntable(EtatDuDocument etatDuDocument) {
        return null;
    }

    @Override
    public EmpruntDto numDeRappel() {
        return null;
    }
}
