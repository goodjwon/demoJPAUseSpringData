package com.example;

import com.example.board.Article;
import com.example.board.ArticleContents;
import com.example.board.ArticleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationArticleTests {

	@Autowired ArticleDao articleDao;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testArticlaSave(){

		/**
		 * 1:1 관계로 인해서 서로의 값이 맵핑 될 수 있는 객채를 생성시에 넘겨주지 않으면
		 * insert 작업에 실패 한다
		 * ArticleContents 생성시에 Article를 넘겨 주지 않으면 hibernate는 연관 객체를 찾게 된다. select 쿼리 발생
		 */
		Article article = new Article(1L, "우리집에 왜 왔니?");
		ArticleContents contents = new ArticleContents(1L, "내용", "html/text", article);

		article.addContest(contents);

		articleDao.save(article);
	}

}
