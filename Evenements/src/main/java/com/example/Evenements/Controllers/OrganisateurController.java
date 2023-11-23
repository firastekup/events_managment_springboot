package com.example.Evenements.Controllers;

import com.example.Evenements.Entity.Invitations;
import com.example.Evenements.Entity.Organisateur;
import com.example.Evenements.services.OrganisateurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/organisateur")
public class OrganisateurController {
    @Autowired
 private OrganisateurServiceImpl organisateurService;

    @PostMapping("/add")
    public Organisateur saveorganisateur(@RequestBody Organisateur organisateur)
    {
        return organisateurService.createOrganisateur(organisateur);
    }

    @GetMapping("/liste")
    public List<Organisateur> getallorganisateur()
    {
        return organisateurService.getAllOrganisateur();
    }

    @GetMapping("/getone/{id}")
    public Organisateur getorganisateur(@PathVariable Long id)
    {
        return organisateurService.getOrganisateurById(id);
    }

    @PutMapping("/update/{id}")
    public Organisateur updateorganisateur(@PathVariable Long id,@RequestBody Organisateur organisateur) {
        Organisateur c1 = organisateurService.getOrganisateurById(id);
        if (c1 != null) {
            organisateur.setId(id);
            return organisateurService.updateOrganisateur(organisateur);

        } else {
            throw new RuntimeException("failled!!!");
        }
    }

    @DeleteMapping("/delete/{id}")
    public HashMap<String,String> deleteorganisateur(@PathVariable Long id) {
        HashMap<String, String> message = new HashMap<>();
        if (organisateurService.getOrganisateurById(id) == null) {
            message.put("etat", "organisateur non trouvé");
            return message;
        }
        try {
            organisateurService .deleteorganisateur(id);
            message.put("etat", "organisateur supprimer");
            return message;
        } catch (Exception e) {
            message.put("etat", "organisateur non trouvé");
            return message;
        }

    }


    }
