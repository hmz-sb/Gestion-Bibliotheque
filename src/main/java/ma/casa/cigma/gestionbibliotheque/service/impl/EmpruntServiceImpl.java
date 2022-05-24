package ma.casa.cigma.gestionbibliotheque.service.impl;

import ma.casa.cigma.gestionbibliotheque.entities.Emprunt;
import ma.casa.cigma.gestionbibliotheque.entities.EtatDuDocument;
import ma.casa.cigma.gestionbibliotheque.service.EmpruntService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EmpruntServiceImpl implements EmpruntService {
    @Override
    public Emprunt renouvelLePret(Date date) {
        return null;
    }

    @Override
    public Emprunt verifierDATErETOUR(Date date) {
        return null;
    }

    @Override
    public Emprunt enCours(Date date) {
        return null;
    }

    @Override
    public Emprunt faireEmprunt(Date date) {
        return null;
    }

    @Override
    public Emprunt finaliserEmprunt(Date date) {
        return null;
    }

    @Override
    public Emprunt siDocumentEmpruntable(EtatDuDocument etatDuDocument) {
        return null;
    }

    @Override
    public Emprunt numDeRappel() {
        return null;
    }
}
