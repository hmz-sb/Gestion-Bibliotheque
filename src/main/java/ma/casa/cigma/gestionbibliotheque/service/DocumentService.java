package ma.casa.cigma.gestionbibliotheque.service;

import ma.casa.cigma.gestionbibliotheque.dto.DocumentDto;
import ma.casa.cigma.gestionbibliotheque.entities.Livre;
import ma.casa.cigma.gestionbibliotheque.entities.TypeDuDocument;

import java.util.List;

public interface DocumentService {

    TypeDuDocument enregisterLivre(Livre livre);
    DocumentDto sortirLivre (long id);
    TypeDuDocument modifierEtat(Livre livre);
    boolean existAutreExemplaire(Livre livre);
    TypeDuDocument estDisponible(Livre livre);

    List<DocumentDto> getAllDocument();
}

