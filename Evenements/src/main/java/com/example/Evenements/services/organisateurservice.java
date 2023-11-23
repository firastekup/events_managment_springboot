package com.example.Evenements.services;

import com.example.Evenements.Entity.Organisateur;

import java.util.List;

public interface organisateurservice {
    List<Organisateur> getAllOrganisateur();
    Organisateur getOrganisateurById(Long id) ;
    void deleteorganisateur(Long id);
    Organisateur updateOrganisateur(Organisateur organisateur);
    Organisateur createOrganisateur(Organisateur organisateur );
}
