package com.example.Evenements.services;

import com.example.Evenements.Entity.Organisateur;
import com.example.Evenements.Entity.Participant;

import java.util.List;

public interface participantservice {
    List<Participant> getAllParticipant();
    Participant getParticipant(Long id) ;
    void deleteParticipant(Long id);
    Participant updateParticipant(Participant participant);
    Participant createParticipant(Participant participant );

}
