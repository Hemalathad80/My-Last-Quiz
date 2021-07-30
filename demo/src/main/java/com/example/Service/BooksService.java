package com.example.Service;

import com.example.Repository.BooksRepository;
import com.example.Entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksService {
	
	 @Autowired
	    BooksRepository booksRepository;
	 
	 public BooksService(BooksRepository booksRepository) {
	        this.booksRepository = booksRepository;
	    }
	 
	 public int addBooks(Books books){
	        return booksRepository.insertBook(books);
	    }
	 
	 public List<Books> findAllBooks(){
	        return booksRepository.getAllBooks();
	    }

}
