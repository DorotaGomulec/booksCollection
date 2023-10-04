package pl.dorotagomulec.bookscollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {


    private ArrayList<Book> booksToRead;
    private ArrayList<Book> finishedBook;

    public Library(ArrayList<Book> booksToRead, ArrayList<Book> finishedBook) {
        booksToRead = new ArrayList<>();
        finishedBook = new ArrayList<>();
        this.booksToRead = booksToRead;
        this.finishedBook = finishedBook;

    }

    public List<Book> showFinishedBooks() {
        return finishedBook;
    }

    public List<Book> showBooksToRead() {
        return booksToRead;
    }

    public boolean addBookToFinishedBooks(Book book) {
        finishedBook.add( book );
        return true;
    }

    public boolean addBookToRead(Book book) {
        booksToRead.add( book );
        return true;
    }

    public String deleteFromFinishedBooks(String titleToRemove) {

      //tu przerwa
        return "Book " + titleToRemove + "has been deleted from list";
    }
}

