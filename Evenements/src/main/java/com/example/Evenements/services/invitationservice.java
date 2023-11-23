package com.example.Evenements.services;

import com.example.Evenements.Entity.Invitations;
import com.example.Evenements.Entity.Participant;

import java.util.List;

public interface invitationservice {
    List<Invitations> getAllInviatation();
    Invitations getInviatation(Long id) ;
    void deleteInvitation(Long id);
    Invitations updateInviation(Invitations invitation);
    Invitations createInvitation(Invitations invitation );
}
