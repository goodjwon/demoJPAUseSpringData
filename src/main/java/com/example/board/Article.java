package com.example.board;

import javax.persistence.*;

/**
 * 1:1 관계 작성
 * Article : ArticleContent
 */
@Entity
public class Article{
    @Id @Column(name="articleId")
    private Long articleId;
    @Column(name="title", length = 100)
    private String title;

    @OneToOne
    private ArticleContents articleContents;

    public Article() {
    }

    public Article(Long articleId, String title, ArticleContents articleContents) {
        this.articleId = articleId;
        this.title = title;
        this.articleContents = articleContents;
    }


}