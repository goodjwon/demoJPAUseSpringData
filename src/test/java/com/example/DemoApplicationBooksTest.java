package com.example;

import com.example.book.Book;
import com.example.book.BookRepository;
import com.example.book.Publisher;
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


    @Test
    public void testBookSave(){

        Book book = new Book("spring workbook4");
        book.addPublishers(new Publisher("by tobi"));

        bookRepository.save(book);

    }
}
