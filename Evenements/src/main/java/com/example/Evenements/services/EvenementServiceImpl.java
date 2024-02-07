package com.example.Evenements.services;

import com.example.Evenements.Entity.Evenements;
import com.example.Evenements.Entity.Invitations;
import com.example.Evenements.Repository.EvenemntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementServiceImpl implements evenementservice {
@Autowired
    public EvenemntRepository evenementrepo;
    @Override
    public List<Evenements> getAllEvenements() {
        return evenementrepo.findAll();
    }

    @Override
    public Evenements getEvenement(Long id) {
         return evenementrepo.findById(id).orElseThrow();
    }

    @Override
    public void deleteEvenements(Long id) {
       evenementrepo.deleteById(id);
    }

    @Override
    public Evenements updateEvenements(Evenements evenements) {
        if (evenementrepo.existsById(evenements.getId()))
        {
            evenementrepo.save(evenements);
        }
        return null;
    }

    @Override
    public Evenements createEvenements(Evenements evenements) {
        return evenementrepo.save(evenements);
    }
}
