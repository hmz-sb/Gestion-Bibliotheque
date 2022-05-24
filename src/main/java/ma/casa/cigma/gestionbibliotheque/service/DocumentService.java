package ma.casa.cigma.gestionbibliotheque.service;

import ma.casa.cigma.gestionbibliotheque.entities.Livre;
import ma.casa.cigma.gestionbibliotheque.entities.TypeDuDocument;

public interface DocumentService {

    TypeDuDocument enregisterLivre(Livre livre);
    TypeDuDocument sortirLivre (Livre livre);
    TypeDuDocument modifierEtat(Livre livre);
    TypeDuDocument existAutreExemplaire(Livre livre);
    TypeDuDocument estDisponible(Livre livre);

}

