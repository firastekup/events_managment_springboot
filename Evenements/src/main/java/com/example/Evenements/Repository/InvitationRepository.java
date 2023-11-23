package com.example.Evenements.Repository;

import com.example.Evenements.Entity.Invitations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationRepository extends JpaRepository<Invitations,Long> {
}
