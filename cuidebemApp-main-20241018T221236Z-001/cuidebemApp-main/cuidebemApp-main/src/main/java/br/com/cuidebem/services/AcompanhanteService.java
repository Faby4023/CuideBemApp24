package br.com.cuidebem.services;

import br.com.cuidebem.repositories.AcompanhanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcompanhanteService {

    @Autowired
    private AcompanhanteRepository acompanhanteRepository;


}
