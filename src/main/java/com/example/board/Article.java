package com.example.board;

import javax.persistence.*;

/**
 * 1:1 관계 작성
 * Article : ArticleContent
 */
@Entity
public class Article{
    @Id @Column(name="article_id") @GeneratedValue(strategy = GenerationType. AUTO)
    private Long articleId;
    @Column(name="title", length = 100)
    private String title;


    //@OneToOne(mappedBy = "article")
    @OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL, mappedBy = "article")
    private ArticleContents articleContents;

    public Article() {
    }

//    public Article(Long articleId, String title) {
//        this.articleId = articleId;
//        this.title = title;
//    }

    //key를 모두 DB에 위임 맞겨도 잘 되는지 테스트.
    public Article(String title) {
        this.title = title;
    }

    public void addContest(ArticleContents articleContents){
        this.articleContents = articleContents;
    }


}