package br.com.cuidebem.repositories;

import br.com.cuidebem.models.idoso.Informacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformacaoRepository extends JpaRepository<Informacao, Long> {
}
