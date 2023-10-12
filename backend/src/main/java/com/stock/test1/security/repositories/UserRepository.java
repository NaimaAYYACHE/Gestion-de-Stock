package com.stock.test1.security.repositories;

import com.stock.test1.security.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , String> {
    User findByNom(String nom);

    Page<User> findByNomContains(String nom , Pageable p);
}
