package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.InformationDuDocumentDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.InformationDuDocument;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class InformationDuDocumentMapping {
    ModelMapper modelMapper=new ModelMapper();

    public InformationDuDocumentDto informationDuDocumentDtoToBo(InformationDuDocument informationDuDocument) {
        InformationDuDocumentDto informationDuDocumentDto=modelMapper.map(informationDuDocument,InformationDuDocumentDto.class);
        return informationDuDocumentDto;
    }


    public InformationDuDocument informationDuDocumentBoToDto(InformationDuDocumentDto informationDuDocumentDto) {
        InformationDuDocument informationDuDocument=modelMapper.map(informationDuDocumentDto,InformationDuDocument.class);
        return informationDuDocument;
    }
}
