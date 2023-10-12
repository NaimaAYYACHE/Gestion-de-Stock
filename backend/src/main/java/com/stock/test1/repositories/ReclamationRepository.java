package com.stock.test1.repositories;

import com.stock.test1.entities.Reclamation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReclamationRepository extends JpaRepository<Reclamation ,Long> {
    Page<Reclamation> findByEtatIn(String[] etats, Pageable pageable);

    @Query("SELECT COUNT(c) FROM Reclamation c")
    Long getTotalReclamations();
}
