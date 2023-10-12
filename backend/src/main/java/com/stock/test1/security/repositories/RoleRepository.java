package com.stock.test1.security.repositories;

import com.stock.test1.security.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role , String> {
    Role findByNom(String nom);
}
