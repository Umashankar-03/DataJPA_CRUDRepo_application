package com.project;

import com.project.entity.Book;
import com.project.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DataJpaCrudRepoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
					SpringApplication.run(DataJpaCrudRepoAppApplication.class, args);

		BookRepository repo = ctxt.getBean(BookRepository.class);


//		Book b = new Book();
//		b.setBookId(101);
//		b.setBookName("Spring");
//		b.setBookPrice(1234.0);
//
//		repo.save(b);
//		System.out.println("Record is inserted....");


		Optional<Book> byId = repo.findById(101);
		System.out.println(byId.get());
	}

}
