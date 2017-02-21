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
public class DemoApplicationTests {

	@Autowired ArticleDao articleDao;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testArticlaSave(){
		ArticleContents contents = new ArticleContents(1L, "내용", "html/text");
		Article article = new Article(1L, "제목", contents);

		articleDao.save(article);
	}

}
