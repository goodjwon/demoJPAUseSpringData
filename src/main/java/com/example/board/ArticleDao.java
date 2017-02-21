package com.example.board;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by goodjwon on 2017-02-21.
 */
public interface ArticleDao extends JpaRepository <Article, Long> {
}
