package main.controller;

import main.BookService;
import model.LibraryBook;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class LibraryBookController {

    @Autowired
    private BookService bookService;

    //@RequestMapping("/v1/LibraryBook")
    @GetMapping("/v1/LibraryBook")
    public List<LibraryBook> getAllLibraryBooks() {
        return bookService.getAllLibraryBooks();
    }

    @GetMapping ("/v1/LibraryBook/{id}")
    public LibraryBook getLibraryBook(@PathVariable String id) {
        return bookService.getLibraryBook(id);
    }

    @PostMapping  ("/v1/LibraryBook")
    public void addLibraryBook(@RequestBody LibraryBook libraryBook) {
        bookService.addLibraryBook(libraryBook);
    }

    @PutMapping ("/v1/LibraryBook/{id}")
    public void updateLibraryBook(@RequestBody LibraryBook libraryBook, @PathVariable String id) {
        bookService.updateLibraryBook(libraryBook, id);
    }

    @DeleteMapping ("/v1/LibraryBook/{id}")
    public void deleteLibraryBook(@RequestBody LibraryBook libraryBook, @PathVariable String id) {
        bookService.deleteLibraryBook(id);
    }


}