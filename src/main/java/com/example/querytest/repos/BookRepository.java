package com.example.querytest.repos;

import com.example.querytest.models.Books;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface BookRepository extends CrudRepository<Books, Long> {
    @Query(value = "select * from public.books b where b.author = ?1", nativeQuery = true)
    ArrayList<Books> findBooksByAuthor(String author);

}
