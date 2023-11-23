package com.example.Evenements.Repository;

import com.example.Evenements.Entity.Evenements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenemntRepository extends JpaRepository<Evenements,Long> {
}
