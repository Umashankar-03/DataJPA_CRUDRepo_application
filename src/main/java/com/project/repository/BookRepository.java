package com.project.repository;

import com.project.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {

    //Finder methods

    //select * from book where book_Price > : price
    public List<Book> findByBookPriceGreaterThan(Double price);

    //select * from book where book_price <: price
    public List<Book> findByBookPriceLessThan(Double price);

    //Select * from book where book_name = :bookName
    public List<Book> findByBookName(String bookName);

// Custom Query :-
    //Native sql Query

   // @Query(value = "Select * from book ", nativeQuery = true)
   // public List<Book> getAllBooks();

    //HQL Query

        @Query("from Book")
        List<Book> getBooks();

}
