package com.stock.test1.repositories;

import com.stock.test1.entities.Categorie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie,Long>{
     Categorie findByNom(String nom );
     Page<Categorie> findByNomContains(String n , Pageable p );

     Page<Categorie> findAll(Pageable pageable);

     @Query("SELECT COUNT(c) FROM Categorie c")
     Long getTotalCategories();

}
