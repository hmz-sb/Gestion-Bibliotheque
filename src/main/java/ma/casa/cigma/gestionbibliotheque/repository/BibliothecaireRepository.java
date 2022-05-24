package ma.casa.cigma.gestionbibliotheque.repository;

import ma.casa.cigma.gestionbibliotheque.entities.Bibliothecaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliothecaireRepository extends JpaRepository<Bibliothecaire, Long> {
}