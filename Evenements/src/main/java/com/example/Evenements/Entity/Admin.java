package com.example.Evenements.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")

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



    @OneToMany(mappedBy = "admin")
    private List<Organisateur> organisa ;

}
