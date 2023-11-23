package com.example.Evenements.Controllers;

import com.example.Evenements.Entity.Inscription;
import com.example.Evenements.Entity.Invitations;
import com.example.Evenements.services.InscriptionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/inscription")
public class InscriptionController {
    private InscriptionServiceImpl inscriptionService;

    @PostMapping("/add")
    public Inscription saveinscription(@RequestBody Inscription inscription) {
        return inscriptionService.createInscription(inscription);
    }

    @GetMapping("/liste")
    public List<Inscription> getallinscription() {
        return inscriptionService.getAllInscription();
    }

    @GetMapping("/getone/{id}")
    public Inscription getallinscription(@PathVariable Long id) {
        return inscriptionService.getInscription(id);
    }

    @PutMapping("/update/{id}")

    public Inscription updateinscription(@PathVariable Long id, @RequestBody Inscription inscription) {
        Inscription c1 = inscriptionService.getInscription(id);
        if (c1 != null) {
            inscription.setId(id);
            return inscriptionService.updateInscription(inscription);

        } else {
            throw new RuntimeException("failled!!!");
        }
    }

    @DeleteMapping("/delete/{id}")
    public HashMap<String, String> deleteinscription(@PathVariable Long id) {
        HashMap<String, String> message = new HashMap<>();
        if (inscriptionService.getInscription(id) == null) {
            message.put("etat", "inscription non trouvé");
            return message;
        }
        try {
            inscriptionService.deleteInscription(id);
            message.put("etat", "inscription supprimer");
            return message;
        } catch (Exception e) {
            message.put("etat", "inscription non trouvé");
            return message;
        }

    }
}
