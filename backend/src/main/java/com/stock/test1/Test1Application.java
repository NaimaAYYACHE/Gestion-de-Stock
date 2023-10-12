package com.stock.test1;

import com.stock.test1.entities.Article;
import com.stock.test1.entities.Categorie;
import com.stock.test1.repositories.ArticleRepository;
import com.stock.test1.repositories.CategorieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        SpringApplication.run(Test1Application.class, args);
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200")); // Remplacez par l'URL de votre application Angular
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE"));
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    ////////////

        //@Bean
        public CommandLineRunner initData(ArticleRepository articleRepository
                ,CategorieRepository categorieRepository) {
            return args -> {
                Categorie categorie = categorieRepository.findById(1L).orElse(null);
                // Créer et ajouter les articles à la base de données
                Article article1 = new Article();
                article1.setNom("gel Cerave");
                article1.setEtat("fixed");
                article1.setPrix(116);
                article1.setDajout(new Date());
              //  article1.setDesciption("description ...");
                article1.setStockMax(100);
                article1.setStockMin(20);
                article1.setStockReel(60);
                article1.setCategorie(categorie);
                articleRepository.save(article1);

            };
        }
        ///////////



     // @Bean

}
