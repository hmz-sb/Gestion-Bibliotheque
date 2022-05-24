package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AdhernetMapping {

    ModelMapper modelMapper=new ModelMapper();

    public AdhernetDto adhernetDtoToBo(Adhernet adhernet) {
        AdhernetDto adhernetDto=modelMapper.map(adhernet,AdhernetDto.class);
        return adhernetDto;
    }


    public Adhernet adhernetBoToDto(AdhernetDto adhernetDto) {
        Adhernet adhernet=modelMapper.map(adhernetDto,Adhernet.class);
        return adhernet;

    }
}
