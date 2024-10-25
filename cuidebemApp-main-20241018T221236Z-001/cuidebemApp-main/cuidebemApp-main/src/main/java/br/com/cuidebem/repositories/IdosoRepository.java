package br.com.cuidebem.repositories;

import br.com.cuidebem.models.idoso.Idoso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdosoRepository extends JpaRepository<Idoso, String> {
}
