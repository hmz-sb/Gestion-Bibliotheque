package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.StatutDuMembreDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.StatutDuMembre;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StatutDuMembreMapping {
    ModelMapper modelMapper=new ModelMapper();

    public StatutDuMembreDto statutDuMembreDtoToBo(StatutDuMembre statutDuMembre) {
        StatutDuMembreDto statutDuMembreDto=modelMapper.map(statutDuMembre,StatutDuMembreDto.class);
        return statutDuMembreDto;
    }


    public StatutDuMembre statutDuMembreBoToDto(StatutDuMembreDto statutDuMembreDto) {
        StatutDuMembre statutDuMembre=modelMapper.map(statutDuMembreDto,StatutDuMembre.class);
        return statutDuMembre;

    }
}
