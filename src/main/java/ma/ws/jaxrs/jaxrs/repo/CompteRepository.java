package ma.ws.jaxrs.jaxrs.repo;

import ma.ws.jaxrs.jaxrs.entite.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}