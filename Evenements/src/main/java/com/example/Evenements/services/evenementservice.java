package com.example.Evenements.services;

import com.example.Evenements.Entity.Evenements;
import com.example.Evenements.Entity.Invitations;

import java.util.List;

public interface evenementservice {
    List<Evenements> getAllEvenements();
    Evenements getEvenement(Long id) ;
    void deleteEvenements(Long id);
    Evenements updateEvenements(Evenements evenements);
    Evenements createEvenements(Evenements evenements );
}
