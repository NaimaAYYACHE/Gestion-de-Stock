package com.stock.test1.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @NotNull
    private  String nom ;

    private  String description;
    @Temporal(TemporalType.TIMESTAMP)
    private  Date   dajout;
    private  float  prix;
    private  int    stockMin;
    private  int     stockMax;
    private  int     stockReel;
    private  String  etat;
    @ManyToOne
    private Categorie categorie;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Demande> demandes = new ArrayList<Demande>();
    @PrePersist
    public void prePersist() {
        this.dajout = new Date();
    }
}
