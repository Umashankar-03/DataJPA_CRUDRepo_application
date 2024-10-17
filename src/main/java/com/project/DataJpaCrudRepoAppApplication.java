package com.project;

import com.project.entity.Book;
import com.project.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DataJpaCrudRepoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
					SpringApplication.run(DataJpaCrudRepoAppApplication.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);

		//Save :- Input entity object
		/*
		Book b = new Book();
		b.setBookId(102);
		b.setBookName("SpringBoot");
		b.setBookPrice(1500.0);

		repo.save(b);
		System.out.println("Record is inserted....");
	    */


	// SaveAll :- Input as a Collection .
		/*
		Book b1 = new Book();
		b1.setBookId(103);
		b1.setBookName("Angular");
		b1.setBookPrice(1800.0);

		Book b2 = new Book();
		b2.setBookId(104);
		b2.setBookName("React Js");
		b2.setBookPrice(2000.0);

//		List<Book> 	booksList = new ArrayList<>();
//		booksList.add(b1);
//		booksList.add(b2);

		repo.saveAll(Arrays.asList(b1,b2));
		System.out.println("Record is inserted");
		*/

	//existById : - Return type Boolean and To check presence of record (true/false)
		/*
		boolean status = repo.existsById(108);
		System.out.println("Record Presence ::" + status);
		*/

	// count :- To get records count in table
		/*
		long count = repo.count();
		System.out.println("Record count ::" +count);
		*/

	// findById : - Return optional To retrieve the record based on single primary Key
		/*
		Optional<Book> byId = repo.findById(101);
		if(byId.isPresent()){
		System.out.println(byId.get());
		}
		*/

	// findAllById : - Return Iterable obj. To retrieve the record based on multiple primary keys

		/*
		Iterable<Book> allById = repo.findAllById(Arrays.asList(101, 102, 103));
		for(Book b : allById){
			System.out.println(b);
		}
		*/

	// findAll :- To retrieve all records from table.
		/*
		Iterable<Book> all = repo.findAll();
		for(Book b : all){
			System.out.println(b);
		}
		 */

	// deleteById(ID) : Delete record based on given PK
		/*
		if(repo.existsById(105)){
			repo.deleteById(105);
		}else {
			System.out.println("No Record is found!");
		}
		 */

	// deleteAllById (Iterable ids): Delete records based on given PKs
		/*
		repo.deleteAllById(Arrays.asList(101,102,103));
		 */

	// delete(E) : Delete record based on given Entity obj

	// deleteAll(Iterable entities): Delete records based on given Entity objs

	// deleteAll ( ) : Delete all records from table (truncate)
		/*
		repo.deleteAll();
		 */

	// Finder Methods.

		/*
		List<Book> byBookPriceGreaterThan = repo.findByBookPriceGreaterThan(1200.0);
		for(Book b : byBookPriceGreaterThan){
			System.out.println(b);
		}
		 */

		/*
		List<Book> byBookPriceLessThan = repo.findByBookPriceLessThan(1800.0);
		for(Book b : byBookPriceLessThan){
			System.out.println(b);
		}
		 */

		/*
		List<Book> byBookName = repo.findByBookName("spring");
		for(Book b : byBookName){
			System.out.println(b);
		}
		 */

	// Custom Query
		//Native Sql query
		/*
		List<Book> allBooks = repo.getAllBooks();
		for(Book b : allBooks){
			System.out.println(b);
		}
		 */
		//HQL Query
		List<Book> books = repo.getBooks();
		for(Book b : books){
			System.out.println(b);
		}


	}

}
