package pl.dorotagomulec.bookscollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    private Library library;

    @Autowired
    public Controller(Library library) {
        this.library = library;
    }

    @GetMapping("/books/all")
    public List<Book> allBooks() {
        return library.showBooks();
    }

    @PostMapping("/books/post")
    public String addBook(@RequestBody Book book) {
        return library.addBook( book );
    }

    @DeleteMapping("/books/delete")
    public String deleteBook(@RequestBody String titleToRemove) {
        return library.deleteFromMyBooks( titleToRemove );
    }
}

