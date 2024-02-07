package com.example.Evenements.services;

import com.example.Evenements.Entity.Invitations;
import com.example.Evenements.Entity.Organisateur;
import com.example.Evenements.Repository.InvitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvitationserviceImpl implements invitationservice {
    @Autowired
private InvitationRepository invitationrepo;
    @Override
    public List<Invitations> getAllInviatation() {
        return invitationrepo.findAll();
    }

    @Override
    public Invitations getInviatation(Long id) {
        Optional<Invitations> optionalInvitations = invitationrepo.findById(id);
        return null;
    }

    @Override
    public void deleteInvitation(Long id) {
        invitationrepo.deleteById(id);

    }

    @Override
    public Invitations updateInviation(Invitations invitation) {
        if (invitationrepo.existsById(invitation.getId()))
        {
            return invitationrepo.save(invitation);
        }
        return null;
    }

    @Override
    public Invitations createInvitation(Invitations invitation) {
        return invitationrepo.save(invitation) ;
    }
}
