package br.com.cuidebem.repositories;

import br.com.cuidebem.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
