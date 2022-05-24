package ma.casa.cigma.gestionbibliotheque.repository;

import ma.casa.cigma.gestionbibliotheque.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}