package com.example.book;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by kw100201 on 2017-02-24.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_publisher", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id")
                               , inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "id"))
    private Set<Publisher> publishers;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
        this.publishers = publishers;
    }

    public void addPublishers(Publisher p){
        if(publishers == null){
            publishers = new HashSet<Publisher>();
        }
        publishers.add(p);
    }
}
