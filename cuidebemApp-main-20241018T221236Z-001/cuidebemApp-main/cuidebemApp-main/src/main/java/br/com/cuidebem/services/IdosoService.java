package br.com.cuidebem.services;

import br.com.cuidebem.repositories.IdosoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdosoService {
    @Autowired

    private IdosoRepository idosoRepository;
}
