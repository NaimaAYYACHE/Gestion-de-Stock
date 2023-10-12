package com.stock.test1.web;


import com.stock.test1.entities.Reclamation;
import com.stock.test1.repositories.ReclamationRepository;
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
public class ReclamationController {

    private ReclamationRepository reclamationRepository;
    @GetMapping("/recours")
    public Page recEnCours(
            @RequestParam (defaultValue = "0") int page,
            @RequestParam (defaultValue = "1") int size
    ){
        String[] etats = {"EN_COURS"};
        return reclamationRepository.findByEtatIn(etats, PageRequest.of(page, size));
    }

    @GetMapping("/rec")
    public Page<Reclamation> getReclamations(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "1") int size
    ) {
        String[] etats = {"acceptée", "refusée"};
        return reclamationRepository.findByEtatIn(etats, PageRequest.of(page, size));
    }

    @GetMapping("/totalr")
    public Long getTotalReclamations() {
        return reclamationRepository.getTotalReclamations();
    }
}
