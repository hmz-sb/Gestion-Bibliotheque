package ma.casa.cigma.gestionbibliotheque.service;

import ma.casa.cigma.gestionbibliotheque.dto.EmpruntDto;
import ma.casa.cigma.gestionbibliotheque.entities.EtatDuDocument;

import java.time.LocalDateTime;
import java.util.Date;

public interface EmpruntService {

    LocalDateTime renouvelLePret (LocalDateTime date);

    EmpruntDto verifierDATErETOUR (Date date);

    EmpruntDto enCours (Date date);

    EmpruntDto faireEmprunt (Date date);

    EmpruntDto finaliserEmprunt (Date date);

    EmpruntDto siDocumentEmpruntable (EtatDuDocument etatDuDocument);

    EmpruntDto numDeRappel ();
}
