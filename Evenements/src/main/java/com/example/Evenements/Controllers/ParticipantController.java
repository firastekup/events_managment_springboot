package com.example.Evenements.Controllers;

import com.example.Evenements.Entity.Evenements;
import com.example.Evenements.Entity.Invitations;
import com.example.Evenements.Entity.Participant;
import com.example.Evenements.services.EvenementServiceImpl;
import com.example.Evenements.services.ParticipantServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/participant")
public class ParticipantController {
    @Autowired
    private  ParticipantServiceimpl participantServiceimpl;
    @Autowired
    private EvenementServiceImpl evenementService;

    @PostMapping("/add/{idevennemet}")
    public Participant saveParticipant(@RequestBody Participant participant, @PathVariable Long idevennemet)
    {
        Evenements e1=evenementService.getEvenement(idevennemet);
       // participant.setEvenements(e1);
        return participantServiceimpl.createParticipant(participant);
    }

    @GetMapping("/liste")
    public List<Participant> getallparticipant()
    {
        return participantServiceimpl.getAllParticipant();
    }

    @GetMapping("/getone/{id}")
    public Participant getparticipant(@PathVariable Long id)
    {
        return participantServiceimpl.getParticipant(id);
    }

    @PutMapping("/update/{id}")
    public Participant updateparticipant(@PathVariable Long id,@RequestBody Participant participant) {
        Participant c1 = participantServiceimpl.getParticipant(id);
        if (c1 != null) {
            participant.setId(id);
            return participantServiceimpl.updateParticipant(participant);

        } else {
            throw new RuntimeException("failled!!!");
        }
    }

    @DeleteMapping("/delete/{id}")
    public HashMap<String,String> deleteparticipant(@PathVariable Long id) {
        HashMap<String, String> message = new HashMap<>();
        if (participantServiceimpl.getParticipant(id) == null) {
            message.put("etat", "participant non trouvé");
            return message;
        }
        try {
            participantServiceimpl.deleteParticipant(id);
            message.put("etat", "participant supprimer");
            return message;
        } catch (Exception e) {
            message.put("etat", "participant non trouvé");
            return message;
        }
    }}