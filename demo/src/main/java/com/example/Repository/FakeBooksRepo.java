package com.example.Repository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Books;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeBooksRepo implements BooksRepository{
	
	private static List<Books> DATABASE = new ArrayList<>();
	
	
	 @Override
	    public int insertBook(Books books) {
	        DATABASE.add(new Books(books.getName()));
	        return 1;
	    }
	 
	 @Override
	    public List<Books> getAllBooks() {
	        return DATABASE;
	    }


}
