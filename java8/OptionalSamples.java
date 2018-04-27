package java;

import java.util.Optional;

public class OptionalSamples {

	private String author;
	
	public static void main(String[] args) {

		Optional<String> author = Optional.ofNullable("Rodrigo Turini, Paulo Silveira");

		boolean hasAuthor = author
				.filter(s -> s.contains("Rodrigo Turini"))
				.isPresent();

		System.out.println(hasAuthor);
		
	}

	public boolean hasAuthor(String name) {
		if (author == null) {
			return false;
		}
		return this.author.contains(name);
	}	
	
}
