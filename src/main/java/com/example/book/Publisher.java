package com.example.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

/**
 * Created by kw100201 on 2017-02-24.
 */
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Set<Book> books;

    public Publisher() {
    }

    public Publisher(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }
}
