package com.example.Evenements.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id_user")

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

    @Column(name="mot_de_pase")
    private String mdp;






}
