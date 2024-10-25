package br.com.cuidebem.repositories;

import br.com.cuidebem.models.contratante.Contratante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratanteRepository extends JpaRepository<Contratante, String> {
}
