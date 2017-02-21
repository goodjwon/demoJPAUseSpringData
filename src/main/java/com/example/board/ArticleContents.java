package com.example.board;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 1:1 관계 작성
 * Article : ArticleContent
 */
@Entity
public class ArticleContents {
    @Id
    private Long contentsId;
    private String content;
    private String contentType;

    public ArticleContents() {
    }

    public ArticleContents(Long contentsId, String content, String contentType) {
        this.contentsId = contentsId;
        this.content = content;
        this.contentType = contentType;
    }
}