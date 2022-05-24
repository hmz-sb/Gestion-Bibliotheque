package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.BibliothecaireDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.Bibliothecaire;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BibliothequeMapping {
    ModelMapper modelMapper=new ModelMapper();

    public BibliothecaireDto bibliothecaireDtoToBo(Bibliothecaire bibliothecaire) {
        BibliothecaireDto bibliothecaireDto=modelMapper.map(bibliothecaire,BibliothecaireDto.class);
        return bibliothecaireDto;
    }


    public Bibliothecaire bibliothecaireBoToDto(BibliothecaireDto bibliothecaireDto) {
        Bibliothecaire bibliothecaire=modelMapper.map(bibliothecaireDto,Bibliothecaire.class);
        return bibliothecaire;
    }
}
