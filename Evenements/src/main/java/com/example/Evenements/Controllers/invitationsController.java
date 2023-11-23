package com.example.Evenements.Controllers;

import com.example.Evenements.Entity.Invitations;
import com.example.Evenements.services.InvitationserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/invitation")
public class invitationsController {
@Autowired
    private InvitationserviceImpl invitationservice;
@PostMapping("/add")
    public Invitations saveinvitation(@RequestBody Invitations invitation)
{
    return invitationservice.createInvitation(invitation);
}

@GetMapping("/liste")
    public List<Invitations> getallinvitation()
{
    return invitationservice.getAllInviatation();
}

@GetMapping("/getone/{id}")
    public Invitations getinvitation(@PathVariable Long id)
{
    return invitationservice.getInviatation(id);
}

@PutMapping("/update/{id}")
    public Invitations updateinvitation(@PathVariable Long id,@RequestBody Invitations invitations) {
    Invitations c1 = invitationservice.getInviatation(id);
    if (c1 != null) {
        invitations.setId(id);
        return invitationservice.updateInviation(invitations);

    } else {
        throw new RuntimeException("failled!!!");
    }
}

    @DeleteMapping("/delete/{id}")
    public HashMap<String,String> deleteInvitation(@PathVariable Long id)
    {
        HashMap<String,String> message=new HashMap<>();
        if(invitationservice.getInviatation(id)==null)
        {
        message.put("etat","invitation non trouvé");
        return message;
        }
        try
        {
            invitationservice.deleteInvitation(id);
            message.put("etat","invitation supprimer");
            return message;
        }catch (Exception e)
        {
            message.put("etat","invitation non trouvé");
            return message;
        }


    }





}
