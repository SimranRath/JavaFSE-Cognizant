package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.entity.Book;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(books);
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        books.add(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        Book book = books.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
        if (book != null) {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setPrice(updatedBook.getPrice());
            book.setIsbn(updatedBook.getIsbn());
            return ResponseEntity.ok(book);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        boolean removed = books.removeIf(b -> b.getId().equals(id));
        if (removed) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = books.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
        return book != null ? ResponseEntity.ok(book) : ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Book>> searchBooks(@RequestParam(required = false) String title,
                                                  @RequestParam(required = false) String author) {
        List<Book> result = books;
        if (title != null) {
            result = result.stream().filter(b -> b.getTitle().equalsIgnoreCase(title)).toList();
        }
        if (author != null) {
            result = result.stream().filter(b -> b.getAuthor().equalsIgnoreCase(author)).toList();
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/header")
    public ResponseEntity<Book> addBookWithCustomHeader(@RequestBody Book book) {
        books.add(book);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Custom-Header", "Bookstore-API")
                .body(book);
    }

    @GetMapping("/{id}/with-links")
    public ResponseEntity<EntityModel<Book>> getBookByIdWithLinks(@PathVariable Long id) {
        Book book = books.stream().filter(b -> b.getId().equals(id)).findFirst().orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));

        EntityModel<Book> resource = EntityModel.of(book);
        resource.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class)
                .getAllBooks()).withRel("all-books"));

        return ResponseEntity.ok(resource);
    }
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Book>> getBooksAsJson(){
        return ResponseEntity.ok(books);
    }
    @GetMapping(produces = "application/xml")
    public ResponseEntity<List<Book>> getBooksAsXml(){
        return ResponseEntity.ok(books);
    }
}
