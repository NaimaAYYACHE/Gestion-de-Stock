package com.stock.test1.web;

import com.stock.test1.entities.Departement;
import com.stock.test1.security.entities.Role;
import com.stock.test1.security.repositories.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {

    private RoleRepository roleRepository;

    @GetMapping("/roles")
    public List<Role> getDeps(){
        return roleRepository.findAll();
    }
}
