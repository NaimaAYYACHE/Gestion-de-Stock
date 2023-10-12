package com.stock.test1.web;

import com.stock.test1.entities.Categorie;
import com.stock.test1.repositories.CategorieRepository;
import lombok.AllArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriesController {
    private CategorieRepository categorieRepository;
    @GetMapping("/pageCategories")
    public Page<Categorie> getCategories(@RequestParam(defaultValue = "") String keyword,
                                         @RequestParam(defaultValue = "0") int page,
                                         @RequestParam(defaultValue = "3") int size) {
        return categorieRepository.findByNomContains(keyword,PageRequest.of(page, size));
    }

    @GetMapping("categories")
    public List<Categorie> getCate(){
        return categorieRepository.findAll();
    }


    @GetMapping("/categorieNom")
    public Categorie getCategorieByNom(String nom){
        return categorieRepository.findByNom(nom);
    }



    @PutMapping("/updateCategorie")
    public Categorie updateCat(@RequestBody Categorie categorie) {
        Categorie categorie1 = categorieRepository.findById(categorie.getId()).orElse(null);
        categorie1.setNom(categorie.getNom());
        categorie1.setDescription(categorie.getDescription());
        categorieRepository.save(categorie1);
        return categorie1;
    }

    @GetMapping("/cateId/{id}")
    public Categorie getCategorieById(@PathVariable Long id){
        return categorieRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/deleteCategorie/{id}")
    public void deleteCat(@PathVariable Long id) {
            categorieRepository.deleteById(id);
    }

    @PostMapping("/addCategorie")
    public Categorie addCategrie(@RequestBody Categorie categorie){
        return categorieRepository.save(categorie);
    }

    @GetMapping("/totalc")
    public Long getTotalCategories() {
        return categorieRepository.getTotalCategories();
    }

}
