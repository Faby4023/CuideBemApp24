package br.com.cuidebem.repositories;

import br.com.cuidebem.models.acompanhante.Acompanhante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcompanhanteRepository extends JpaRepository<Acompanhante, String> {
}
