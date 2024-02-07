package com.example.Evenements.services;

import com.example.Evenements.Entity.Organisateur;
import com.example.Evenements.Entity.Participant;
import com.example.Evenements.Repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantServiceimpl implements participantservice {
    @Autowired
    private ParticipantRepository participantrepository;
    @Override
    public List<Participant> getAllParticipant() {
        return participantrepository.findAll();
    }

    @Override
    public Participant getParticipant(Long id) {
        Optional<Participant> optionalParticipant= participantrepository.findById(id);
        return null;    }

    @Override
    public void deleteParticipant(Long id) {
        participantrepository.deleteById(id);

    }

    @Override
    public Participant updateParticipant(Participant participant) {
        if (participantrepository.existsById(participant.getId()))
        {
            return participantrepository.save(participant);
        }
        return null;
    }

    @Override
    public Participant createParticipant(Participant participant) {
        return participantrepository.save(participant);
    }
}
