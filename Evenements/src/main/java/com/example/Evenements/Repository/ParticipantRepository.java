package com.example.Evenements.Repository;

import com.example.Evenements.Entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {
}
