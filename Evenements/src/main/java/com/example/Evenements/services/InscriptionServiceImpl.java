package com.example.Evenements.services;

import com.example.Evenements.Entity.Evenements;
import com.example.Evenements.Entity.Inscription;
import com.example.Evenements.Repository.InscriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscriptionServiceImpl implements inscriptionservie {
    private InscriptionRepository inscriptionrepository;
    @Override
    public List<Inscription> getAllInscription() {
        return inscriptionrepository.findAll();
    }

    @Override
    public Inscription getInscription(Long id) {
        Optional<Inscription> optionalinscription=inscriptionrepository.findById(id);
    return null;
    }

    @Override
    public void deleteInscription(Long id) {
        inscriptionrepository.deleteById(id);

    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        if (inscriptionrepository.existsById(inscription.getId()))
        {
            inscriptionrepository.save(inscription);
        }
        return null;
    }

    @Override
    public Inscription createInscription(Inscription inscription) {
        return inscriptionrepository.save(inscription);
    }
}
