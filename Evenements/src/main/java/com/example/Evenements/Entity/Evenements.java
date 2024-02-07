package com.example.Evenements.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
public class Evenements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evenement")
    private Long id;

    @Column(name="nom_evenement")
    private String nom_evenement;

    @Column(name="Date_evenement")
    private Date date_even;

    @Column(name="Heure_even")
    private String Heure_evenement;


    @Column(name="lieux_even")
    private String lieu_even;

    @Column(name="description")
    private String description;

    @Column(name="type")
    private String type_even;

    @Column(name="frais")
    private float frais_even;

    @Column(name="Status")
    private String status;

    @OneToMany(mappedBy = "evenements")
    private List<Organisateur> organisa;

     @ManyToMany
   List<Inscription>inscriptionList;


     @OneToMany(mappedBy = "evenements")
     private List<Participant>participantList;
     @JsonIgnore
     @OneToMany(mappedBy = "evenements1",cascade = CascadeType.REMOVE)
     private List<Invitations>invitationsList;






}
