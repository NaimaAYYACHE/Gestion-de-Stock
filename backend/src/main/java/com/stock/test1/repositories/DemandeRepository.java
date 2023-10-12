package com.stock.test1.repositories;

import com.stock.test1.entities.Demande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DemandeRepository extends JpaRepository<Demande , Long> {

    Page<Demande> findByEtatIsFalse(Pageable pageable);
    Page<Demande> findByEtatIsTrue(Pageable pageable);

    @Query("SELECT COUNT(c) FROM Demande c")
    Long getTotalDemandes();
}
