package com.example.Evenements.Repository;

import com.example.Evenements.Entity.Organisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganisateurRepository extends JpaRepository<Organisateur,Long> {
}
