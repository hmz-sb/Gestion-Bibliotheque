package ma.casa.cigma.gestionbibliotheque.repository;

import ma.casa.cigma.gestionbibliotheque.entities.StatutDuMembre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutDuMembreRepository extends JpaRepository<StatutDuMembre, Long> {
}