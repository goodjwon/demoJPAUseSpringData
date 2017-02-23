package com.example;

import com.example.book.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by kw100201 on 2017-02-24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationBooksTest {

    @Autowired  BookRepository bookRepository;

    @Test
    public void ContextLoad(){};
}
