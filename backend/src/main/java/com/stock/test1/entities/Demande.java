package com.stock.test1.entities;


import com.stock.test1.security.entities.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Demande {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Temporal(TemporalType.DATE)
    private Date dateD;
    private boolean etat = false;
    private int nbA;
    @ManyToOne
    private User user;

    @ManyToMany(mappedBy = "demandes" , fetch = FetchType.EAGER)
    private List<Article> articles = new ArrayList<Article>();

    @PrePersist
    public void prePersist() {
        this.dateD = new Date();
    }
}
