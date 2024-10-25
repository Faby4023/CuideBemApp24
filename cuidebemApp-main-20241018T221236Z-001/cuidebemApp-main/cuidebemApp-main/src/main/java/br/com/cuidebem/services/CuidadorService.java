package br.com.cuidebem.services;

import br.com.cuidebem.repositories.CuidadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuidadorService {
    @Autowired

    private CuidadorRepository cuidadorRepository;
}
