package com.example.Evenements.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Invitations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_invitation")
    private Long id;

    @Column(name = "Nom_invitation")
    private String nom_invit;

    @Column(name = "Status")
    private String Status;

    @Column(name = "message_invit")
    private String message;

@ManyToOne
    private Evenements evenements1;



}
