package com.stock.test1.repositories;

import com.stock.test1.entities.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<Article,Long> {

    Page<Article> findByNomContains(String k , Pageable p);
    @Query("SELECT COUNT(c) FROM Article c")
    Long getTotalArticle();

}
