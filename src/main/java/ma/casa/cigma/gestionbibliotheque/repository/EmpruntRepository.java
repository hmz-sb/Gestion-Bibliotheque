package ma.casa.cigma.gestionbibliotheque.repository;

import ma.casa.cigma.gestionbibliotheque.entities.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {
}