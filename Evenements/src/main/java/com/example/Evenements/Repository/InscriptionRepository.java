package com.example.Evenements.Repository;

import com.example.Evenements.Entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription,Long> {

}
