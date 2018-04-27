package java;

public class Book {
	private final String name;
	private final String author;

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public boolean hasAuthor(String name) {
		return author.contains(name);
	}

	@Override
	public String toString() {
		return "\nlivro:	" + name + "\nautor:	" + author;
	}

}