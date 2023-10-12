package com.stock.test1.web;

import com.stock.test1.entities.Demande;
import com.stock.test1.repositories.DemandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class DemandeController {

    private DemandeRepository demandeRepository;

    @GetMapping("/dmsfalse")
    public Page<Demande> getDmsFalse(@RequestParam (defaultValue = "0") int page,
                                     @RequestParam (defaultValue = "2") int size){
        return demandeRepository.findByEtatIsFalse(PageRequest.of(page,size));
    }

    @GetMapping("/dmstrue")
    public Page<Demande> getDmstrue(@RequestParam (defaultValue = "0") int page,
                                     @RequestParam (defaultValue = "2") int size){
        return demandeRepository.findByEtatIsTrue(PageRequest.of(page,size));
    }

    @GetMapping("/totald")
    public Long getTotalDemandes() {
        return demandeRepository.getTotalDemandes();
    }
}
