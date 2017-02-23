package com.example.book;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by kw100201 on 2017-02-24.
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
}
