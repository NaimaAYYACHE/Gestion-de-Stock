package com.stock.test1.web;

import com.stock.test1.entities.Departement;
import com.stock.test1.repositories.DepartementRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class DepartementController {
    private DepartementRepository departementRepository;

    @GetMapping("/pageDep")
    public Page getPageDep(
            @RequestParam (defaultValue = "") String keyword,
            @RequestParam (defaultValue = "0") int page ,
            @RequestParam (defaultValue = "5")  int size
    ){
        return departementRepository.findByNomDepContains(keyword , PageRequest.of(page ,size));
    }

    @GetMapping("/deps")
    public List<Departement> getDeps(){
        return departementRepository.findAll();
    }

    @PostMapping("/addDep")
    public Departement ajouterDep(@RequestBody Departement departement){
        return  departementRepository.save(departement);
    }

    @GetMapping("/DepById/{id}")
    public Departement depById(@PathVariable Long id){
        return departementRepository.findById(id).orElse(null);
    }

    @PutMapping("/updateDep")
    public  Departement modifierDep(@RequestBody Departement departement){
        Departement departement1 = departementRepository.findById(departement.getId()).orElse(null);
        departement1.setChefDep(departement.getChefDep());
        departement.setNomDep(departement.getNomDep());
        return  departementRepository.save(departement);
    }

    @DeleteMapping("/deleteDep/{id}")
    public  void  deleteDepr(@PathVariable Long id){
        departementRepository.deleteById(id);
    }

}
