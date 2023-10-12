package com.stock.test1.repositories;

import com.stock.test1.entities.Departement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement , Long> {

    Page<Departement> findByNomDepContains(String s , Pageable p);

}
