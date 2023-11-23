package com.example.Evenements.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Organisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_organisateur")

    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="tel")
    private String tel;

    @Column(name="email")
    private String email;

    @Column(name="adresse")
    private String adresse;

    @ManyToOne
    private Admin admin;
    @ManyToOne
    private Evenements evenements;



}





