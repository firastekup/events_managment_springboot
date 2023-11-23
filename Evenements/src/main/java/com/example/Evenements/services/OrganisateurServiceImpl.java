package com.example.Evenements.services;

import com.example.Evenements.Entity.Evenements;
import com.example.Evenements.Entity.Organisateur;
import com.example.Evenements.Repository.OrganisateurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganisateurServiceImpl implements organisateurservice {
    private OrganisateurRepository organisateurrepo;

    @Override
    public List<Organisateur> getAllOrganisateur() {

        return organisateurrepo.findAll();
    }

    @Override
    public Organisateur getOrganisateurById(Long id)
    {
        Optional<Organisateur> optionalorganisateur= organisateurrepo.findById(id);
        return null;
    }

    @Override
    public void deleteorganisateur(Long id) {
        organisateurrepo.deleteById(id);
    }


    @Override
    public Organisateur updateOrganisateur(Organisateur organisateur) {
        if (organisateurrepo.existsById(organisateur.getId())) {
            return organisateurrepo.save(organisateur);
        }
        return null;
    }

    @Override
    public Organisateur createOrganisateur(Organisateur organisateur) {
        return organisateurrepo.save(organisateur);
    }
}
