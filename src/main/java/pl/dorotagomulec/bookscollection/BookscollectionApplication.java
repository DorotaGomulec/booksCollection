package pl.dorotagomulec.bookscollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class BookscollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookscollectionApplication.class, args);

		ArrayList<Book> btr = new ArrayList<>();
		ArrayList<Book> rb = new ArrayList<>();
		Library library = new Library( btr,rb );
		Book b = new Book( "tytul", "autor", 200 );
		rb.add( b );
		System.out.println(rb);
		library.deleteFromFinishedBooks( "tytul" );
		System.out.println(rb);
	}

}
