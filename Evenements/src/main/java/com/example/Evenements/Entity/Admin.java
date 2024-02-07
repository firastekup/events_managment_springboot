package com.example.Evenements.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Admin extends User {


    @OneToMany(mappedBy = "admin")
    private List<Organisateur> organisa ;


}
