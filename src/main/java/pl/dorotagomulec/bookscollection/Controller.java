package pl.dorotagomulec.bookscollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class Controller {

    private Library library;

    @Autowired
    public Controller(Library library) {
        this.library = library;
    }

    @GetMapping("/all")
    public List<Book> allBooks() {
        return library.showBooks();
    }

    @PostMapping("/post")
    public String addBook(@RequestBody Book book) {
        return library.addBook( book );
    }

    @DeleteMapping("/delete")
    public String deleteBook(@RequestBody String titleToRemove) {
        return library.deleteFromMyBooks( titleToRemove );
    }

    @GetMapping("/finished")
    public List<Book> showFinishedBooks() {
        return library.showFinishedBooks();
    }

    @GetMapping("/unfinished")
    public List<Book> showUnfinishedBooks() {
        return library.showUnfinishedBooks();
    }
}

