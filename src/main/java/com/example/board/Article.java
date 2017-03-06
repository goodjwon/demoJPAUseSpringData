package com.example.board;

import javax.persistence.*;

/**
 * 1:1 관계 작성
 * Article : ArticleContent
 */
@Entity
public class Article{
    @Id @Column(name="article_id")
    private Long articleId;
    @Column(name="title", length = 100)
    private String title;

    @OneToOne(mappedBy = "article")
    private ArticleContents articleContents;

    public Article() {
    }

    public Article(Long articleId, String title) {
        this.articleId = articleId;
        this.title = title;

    }

    public void addContest(ArticleContents articleContents){
        this.articleContents = articleContents;
    }


}