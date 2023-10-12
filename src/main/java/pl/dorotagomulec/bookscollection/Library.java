package pl.dorotagomulec.bookscollection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Library {

    private ArrayList<Book> myBooks;

    public ArrayList<Book> getMyBooks() {
        return myBooks;
    }

    @Autowired
    public Library(ArrayList<Book> myBooks) {
        myBooks = new ArrayList<>();
        this.myBooks = myBooks;
    }


    public List<Book> showBooks() {
        return myBooks;
    }

    public String addBook(Book book) {
        myBooks.add( book );
        return "Book has been added to the list";
    }

    public String deleteFromMyBooks(String titleToRemove) {
        for (Book book : myBooks) {
            if (book.getTitle().equals( titleToRemove )) {
                myBooks.remove( book );
            }
        }
        return "done";
    }


    public List<Book> showFinishedBooks() {
        ArrayList<Book> finishedBooks = new ArrayList<>();
        for (Book book : myBooks) {
            if (book.isFinished()) {
                finishedBooks.add( book );
            }
        }
        return finishedBooks;
    }


    public List<Book> showUnfinishedBooks() {
        ArrayList<Book> unfinishedBooks = new ArrayList<>();
        for (Book book : myBooks) {
            if (!book.isFinished()) {
                unfinishedBooks.add( book );
            }
        }
        return unfinishedBooks;
    }


    public void updateAsReadBook(String titleOfBookToUpdate) {
        for (Book book : myBooks) {
            if (book.getTitle().equals( titleOfBookToUpdate )) {
                book.setFinished( true );
            }
        }
    }
}




