package it.html.tutorial.library.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("books/{book_id}/authors")
public class AuthorServices {
	@GET
	public List<Author> list(@PathParam("{book_id}") long bookId) {
		Author author = new Author();
		author.setId(1);
		author.setName("Joanne");
		author.setSurname("Rowling");
		List<Author> authors = new ArrayList<Author>();
		authors.add(author);
		return authors;
	}
}
