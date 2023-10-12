package com.stock.test1.entities;

import com.stock.test1.security.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Reclamation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String etat;

    private String description;
    @Temporal(TemporalType.DATE)
    private Date dateR;
    @ManyToOne
    private User user;
    @OneToOne
    private Demande demande;
}
