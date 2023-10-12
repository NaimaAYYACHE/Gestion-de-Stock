package com.stock.test1.web;

import com.stock.test1.entities.Article;
import com.stock.test1.repositories.ArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleController {
     private ArticleRepository articleRepository;

     @GetMapping("/articles")
     public List<Article>  getArticles (){
         return  articleRepository.findAll();
     }

     @GetMapping("/PageArt")
     public Page<Article> getArtPage(
             @RequestParam (defaultValue = "") String keyword ,
             @RequestParam (defaultValue = "0") int page ,
             @RequestParam (defaultValue = "5") int size
     ){
         return articleRepository.findByNomContains(keyword , PageRequest.of(page,size));
     }

     @PostMapping("/addArt")
     public Article ajouterArticle(@RequestBody Article article) {
         return articleRepository.save(article);
     }

     @GetMapping("/article/{id}")
     public Article getArticleByID(@PathVariable Long id){
         return articleRepository.findById(id).orElse(null);
     }

     @PutMapping("/updateArt")
     public Article modifierArticle(@RequestBody Article article){
         Article art = articleRepository.findById(article.getId()).orElse(null);
         art.setPrix(article.getPrix());
         art.setNom(article.getNom());
         art.setCategorie(article.getCategorie());
         art.setStockMax(article.getStockMax());
         art.setStockMin(article.getStockMin());
         art.setStockReel(article.getStockReel());
         art.setDescription(article.getDescription());
         return articleRepository.save(art);
     }

     @DeleteMapping("/deleteArt/{id}")
     public void supprimeArticle(@PathVariable Long id){
         articleRepository.deleteById(id);
     }


    @GetMapping("/totala")
    public Long getTotalArticles() {
        return articleRepository.getTotalArticle();
    }

}
