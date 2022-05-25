package ma.casa.cigma.gestionbibliotheque.service;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.StatutDuMembre;

import java.util.List;

public interface AdhernetService {


    Adhernet addAdhernet(Adhernet adhernet);

    AdhernetDto findByNom(String adhernet);

    StatutDuMembre getByStatut(Long id);

    List<AdhernetDto> getAllAdhernet();


}
