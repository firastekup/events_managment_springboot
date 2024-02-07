package com.example.Evenements.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Organisateur extends User {


   @ManyToOne
    private Admin admin;
    @ManyToOne
    private Evenements evenements;



}





