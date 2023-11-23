package com.example.Evenements.services;

import com.example.Evenements.Entity.Inscription;

import java.util.List;

public interface inscriptionservie {
    List<Inscription> getAllInscription();
    Inscription getInscription(Long id) ;
    void deleteInscription(Long id);
    Inscription updateInscription(Inscription inscription);
    Inscription createInscription(Inscription inscription );
}
