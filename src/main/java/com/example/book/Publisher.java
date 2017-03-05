package com.example.book;

import javax.persistence.*;
import java.util.HashSet;
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

    @ManyToMany(mappedBy = "publishers")
    private Set<Book> books;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        if(books==null){
            books = new HashSet<Book>();
        }
        books.add(book);
    }
}
