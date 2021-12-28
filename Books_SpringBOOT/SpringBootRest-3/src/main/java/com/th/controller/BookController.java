package com.th.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.model.Book;
import com.th.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {
	
	//List<String> blist = new ArrayList<String>()
	@Autowired
	BookRepository jp;
	//put 'POST' in PostMan
	@PostMapping("/book")
	public ResponseEntity<Book> save (@RequestBody Book b){
		Book bk = jp.save(b);
		return new ResponseEntity<Book>(bk,HttpStatus.OK);
	}
	//put 'GET' in PostMan
	@GetMapping("/getAllBooks")
	public  ResponseEntity<List<Book>> getAllBooks(){
		
		List<Book> blist = jp.findAll();
		return new ResponseEntity<List<Book>>(blist,HttpStatus.OK);
	}
	//put 'GET' in PostMan
	@GetMapping("/getBookById/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable int id){
		
		Optional<Book> bk = jp.findById(id);
		if(bk.isPresent()) {
			Book b= bk.get();
			return new ResponseEntity<Book>(b,HttpStatus.OK);
		}
		else
			return new  ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		
	}
	//put 'DELETE' in PostMan
	@DeleteMapping("/d/{id}")
	public ResponseEntity<Book> deleteBookById(@PathVariable int id){
		if(jp.existsById(id)) {
			jp.deleteById(id);
			return new ResponseEntity<Book>(HttpStatus.NO_CONTENT);
		}
			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}
}