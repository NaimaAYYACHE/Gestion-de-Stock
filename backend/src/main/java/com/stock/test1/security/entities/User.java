package com.stock.test1.security.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stock.test1.entities.Demande;
import com.stock.test1.entities.Departement;
import com.stock.test1.entities.Reclamation;
import com.stock.test1.security.entities.Role;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class User {
    @Id
    private String id;
    @Column(unique = true)
    private String nom;
    private String password;
    @Column(unique = true)
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateC;
    @ManyToOne
    private  Role role;
    @ManyToOne
    private Departement departement;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany
    private List<Demande> demandes ;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "user")
    private List<Reclamation> reclamations;
    @PrePersist
    public void prePersist() {
        this.dateC = new Date();
    }
}