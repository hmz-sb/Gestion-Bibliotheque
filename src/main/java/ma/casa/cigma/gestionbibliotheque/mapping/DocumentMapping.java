package ma.casa.cigma.gestionbibliotheque.mapping;

import ma.casa.cigma.gestionbibliotheque.dto.AdhernetDto;
import ma.casa.cigma.gestionbibliotheque.dto.DocumentDto;
import ma.casa.cigma.gestionbibliotheque.entities.Adhernet;
import ma.casa.cigma.gestionbibliotheque.entities.Document;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DocumentMapping {
    ModelMapper modelMapper=new ModelMapper();

    public DocumentDto documentDtoToBo(Document document) {
        DocumentDto documentDto=modelMapper.map(document,DocumentDto.class);
        return documentDto;
    }


    public Document documentBoToDto(DocumentDto documentDto) {
        Document document=modelMapper.map(documentDto,Document.class);
        return document;
    }
}
