package ma.casa.cigma.gestionbibliotheque.repository;

import ma.casa.cigma.gestionbibliotheque.entities.InformationDuDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationDuDocumentRepository extends JpaRepository<InformationDuDocument, Long> {
}