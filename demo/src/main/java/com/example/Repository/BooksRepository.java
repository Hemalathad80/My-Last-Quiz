package com.example.Repository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Books;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository {
	
	int insertBook(Books books);

    List<Books> getAllBooks();

}
