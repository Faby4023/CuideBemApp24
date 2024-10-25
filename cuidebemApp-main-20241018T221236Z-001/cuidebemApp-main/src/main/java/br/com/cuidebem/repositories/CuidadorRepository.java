package br.com.cuidebem.repositories;

import br.com.cuidebem.models.cuidador.Cuidador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuidadorRepository extends JpaRepository<Cuidador, String> {
}
