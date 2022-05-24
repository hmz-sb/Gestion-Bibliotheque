package ma.casa.cigma.gestionbibliotheque.service.impl;


import ma.casa.cigma.gestionbibliotheque.entities.Livre;
import ma.casa.cigma.gestionbibliotheque.entities.TypeDuDocument;
import ma.casa.cigma.gestionbibliotheque.service.DocumentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class DocumentServiceImpl implements DocumentService {


    @Override
    public TypeDuDocument enregisterLivre(Livre livre) {

        return null;
    }


    @Override
    public TypeDuDocument sortirLivre(Livre livre) {
        return null;
    }

    @Override
    public TypeDuDocument modifierEtat(Livre livre) {
        return null;
    }

    @Override
    public TypeDuDocument existAutreExemplaire(Livre livre) {
        return null;
    }

    @Override
    public TypeDuDocument estDisponible(Livre livre) {
        return null;
    }
}
