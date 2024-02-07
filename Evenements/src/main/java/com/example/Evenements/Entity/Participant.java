package com.example.Evenements.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Participant extends User {

      @ManyToOne
      @JsonIgnore
     private Evenements evenements;

}
