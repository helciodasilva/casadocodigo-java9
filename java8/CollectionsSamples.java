package java;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSamples {

	public static void main(String[] args) {
		
		List<Book> allBooks = new ArrayList<>();
		allBooks.add(new Book("Desbravando	Java", "Rodrigo	Turini"));
		allBooks.add(new Book("APIs	Java", "Rodrigo	Turini"));
		allBooks.add(new Book("Java	8	Prático", "Rodrigo	Turini,	Paulo	Silveira"));
		allBooks.add(new Book("TDD", "Mauricio	Aniche"));
		allBooks.add(new Book("Certificação	Java", "Guilherme	Silveira"));

		List<Book> filteredBooks = new ArrayList<>();
		for (Book book : allBooks) {
			if (book.hasAuthor("Rodrigo	Turini")) {
				filteredBooks.add(book);
			}
		}

		Collections.sort(filteredBooks, new Comparator<Book>() {

			@Override
			public int compare(Book b1, Book b2) {
				return b1.getName().compareTo(b2.getName());
			}
		});

		for (Book book : filteredBooks) {
			System.out.println(book);
		}
		
		allBooks.stream()
		.filter(book -> book.hasAuthor("Rodrigo Turini"))
		.sorted(comparing(Book::getName))
		.forEach(System.out::println);

	}

}
