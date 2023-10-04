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

    @GetMapping("/books/finished")
    public List<Book> finishedbooks(){
        return library.showFinishedBooks();
    }

    @GetMapping("/books/unfinished")
    public List<Book> booksToRead() {
        return library.showBooksToRead();
    }

    @PostMapping("/books/unfinished/post")
    public boolean addBookToRead(@RequestBody Book book){
        return library.addBookToRead( book );
    }

    @PostMapping("/books/finished/post")
    public boolean addBookToFinishedBooks(@RequestBody Book book){
        return library.addBookToFinishedBooks( book );
    }

    @DeleteMapping("/books/finished/delete")
    public String deleteBookFromFinishedBooks (@RequestBody String titleToRemove){
        return library.deleteFromFinishedBooks( titleToRemove );
    }
}
