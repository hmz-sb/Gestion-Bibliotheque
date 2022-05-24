package ma.casa.cigma.gestionbibliotheque.service;

import ma.casa.cigma.gestionbibliotheque.entities.Emprunt;
import ma.casa.cigma.gestionbibliotheque.entities.EtatDuDocument;

import java.util.Date;

public interface EmpruntService {

    Emprunt renouvelLePret (Date date);

    Emprunt verifierDATErETOUR (Date date);

    Emprunt enCours (Date date);

    Emprunt faireEmprunt (Date date);

    Emprunt finaliserEmprunt (Date date);

    Emprunt siDocumentEmpruntable (EtatDuDocument etatDuDocument);

    Emprunt numDeRappel ();
}
