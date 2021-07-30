package com.example.Controller;

import com.example.Entity.Books;
import com.example.Service.BooksService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/books")
@RestController
public class BooksController {

	@Autowired
	BooksService booksService;

	public BooksController(BooksService booksService) {
		this.booksService = booksService;
	}

	@PostMapping
	public int addBooks(@RequestBody Books books) {
		return booksService.addBooks(books);
	}

	@GetMapping
	public List<Books> returnAllBooks() {
		return booksService.findAllBooks();
	}

}
