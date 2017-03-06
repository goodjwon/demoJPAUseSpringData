package com.example.board;

import javax.persistence.*;

/**
 * 1:1 관계 작성
 * Article : ArticleContent
 */
@Entity
public class ArticleContents {
    @Id @Column(name = "contents_id")
    private Long contentsId;
    private String content;
    private String contentType;

    @OneToOne
    @JoinColumn(name="article_id")
    private Article article;

    public ArticleContents() {
    }

    public ArticleContents(Long contentsId, String content, String contentType, Article article) {
        this.contentsId = contentsId;
        this.content = content;
        this.contentType = contentType;
        this.article = article;
    }
}