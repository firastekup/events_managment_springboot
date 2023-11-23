package com.example.Evenements.Controllers;

import com.example.Evenements.Entity.Evenements;
import com.example.Evenements.Entity.Organisateur;
import com.example.Evenements.services.EvenementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/evenement")
public class EvenementController {
    @Autowired
    private EvenementServiceImpl evenementService;

    @PostMapping("/add")
    public Evenements saveevenement(@RequestBody Evenements evenement)
    {
        return evenementService.createEvenements(evenement);
    }

    @GetMapping("/liste")
    public List<Evenements> getallevenement()
    {
        return evenementService.getAllEvenements();
    }

    @GetMapping("/getone/{id}")
    public Evenements getevenement(@PathVariable Long id)
    {
        return evenementService.getEvenement(id);
    }

    @PutMapping("/update/{id}")
    public Evenements updateevenement(@PathVariable Long id,@RequestBody Evenements evenements) {
        Evenements c1 = evenementService.getEvenement(id);
        if (c1 != null) {
            evenements.setId(id);
            return evenementService.updateEvenements(evenements);

        } else {
            throw new RuntimeException("failled!!!");
        }
    }

    @DeleteMapping("/delete/{id}")
    public HashMap<String,String> deleteevenement(@PathVariable Long id) {
        HashMap<String, String> message = new HashMap<>();
        if (evenementService.getEvenement(id) == null) {
            message.put("etat", "evenement non trouvé");
            return message;
        }
        try {
            evenementService .deleteEvenements(id);
            message.put("etat", "evenement supprimer");
            return message;
        } catch (Exception e) {
            message.put("etat", "evenement non trouvé");
            return message;
        }

    }
}
