package com.example.Evenements.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_inscription")
    private Long id;

    @Column(name = "Date")
    private Date date;

    @Column(name = "nom_inscr")
    private String nom;
    @Column(name = "prenom_inscription")
    private String prenom;
    @Column(name = "cin_inscription")
    private String cin;
    @ManyToMany
    private List<Evenements>evenementsList;

}
