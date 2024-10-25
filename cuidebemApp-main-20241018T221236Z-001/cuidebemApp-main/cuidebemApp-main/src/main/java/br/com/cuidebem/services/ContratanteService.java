package br.com.cuidebem.services;

import br.com.cuidebem.repositories.ContratanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratanteService {

    @Autowired
    private ContratanteRepository contratanteRepository;
}
