package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.EmpruntDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.Emprunt;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpruntMapping {
    ModelMapper modelMapper=new ModelMapper();

    public EmpruntDto empruntDtoToBo(Emprunt emprunt) {
        EmpruntDto empruntDto=modelMapper.map(emprunt,EmpruntDto.class);
        return empruntDto;
    }


    public Emprunt empruntBoToDto(EmpruntDto empruntDto) {
        Emprunt emprunt=modelMapper.map(empruntDto,Emprunt.class);
        return emprunt;

    }
}
