package ma.casa.cigma.gestionbibliotheque.service.impl;


import ma.casa.cigma.gestionbibliotheque.dto.DocumentDto;
import ma.casa.cigma.gestionbibliotheque.entities.Document;
import ma.casa.cigma.gestionbibliotheque.entities.Livre;
import ma.casa.cigma.gestionbibliotheque.entities.TypeDuDocument;
import ma.casa.cigma.gestionbibliotheque.errors.BibliRunTimeException;
import ma.casa.cigma.gestionbibliotheque.mapping.DocumentMapping;
import ma.casa.cigma.gestionbibliotheque.repository.DocumentRepository;
import ma.casa.cigma.gestionbibliotheque.service.DocumentService;
import ma.casa.cigma.gestionbibliotheque.web.DocumentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Transactional
@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;
    @Autowired
    DocumentController documentController;
    @Autowired
    DocumentMapping documentMapping;
    @Autowired
    MessageSource messageSource;

    @Override
    public TypeDuDocument enregisterLivre(Livre livre) {
       return documentRepository.save(livre);
    }


    @Override
    public DocumentDto sortirLivre(long id) {
         documentRepository.deleteById(id);
         return null;
    }

    @Override
    public TypeDuDocument modifierEtat(Livre livre) {
        if (documentRepository.findById(livre.getId()).isPresent()){
            return documentRepository.save(livre);
        }
        return null;
    }

    @Override
    public boolean existAutreExemplaire(Livre livre) {
        return documentRepository.existsById(livre.getId());
    }


    @Override
    public TypeDuDocument estDisponible(Livre livre) {
        if (documentRepository.existsById(livre.getId())) {
            return livre;
        }
        return null;
    }

    @Override
    public List<DocumentDto> getAllDocument() {
        List<Document> documentList = documentRepository.findAll();

        if (CollectionUtils.isEmpty(documentList)) {
            throw new BibliRunTimeException(HttpStatus.BAD_REQUEST, messageSource.getMessage("document.list.is.empty",
                    new Object[]{}, Locale.getDefault()));
        }

        List<DocumentDto> documentDtoList = new ArrayList<>();
        documentList.stream().forEach(document  ->
        {
            DocumentDto documentDto = documentMapping.documentDtoToBo(document);
            documentDtoList.add(documentDto);
        });
        return documentDtoList;
    }

}
